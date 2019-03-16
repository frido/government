import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { catchError, map, take } from 'rxjs/operators';
import { OsobaView, ElectionView, CommissionView, DepartmentView } from './interfaces/interfaceOsoba';
import { spolky } from './modules/shared/spolky';

@Injectable({
  providedIn: 'root',
})
export class ApiService {

  // TODO: nazov "miestny poslanec" pre detvu je nespravny

  base: string = null;

  constructor(
    private http: HttpClient) {
    this.base = environment.backendLink;
  }

  get(link: string): Observable<any> {
    return this.http.get<any>(link)
      .pipe(
        map(value => value.data),
        take(1),
        catchError(this.handleError)
      );
  }

  // getSpolok(spolokKey: string): Observable<Spolok> {
  //   return this.get(this.base + 'spolok/' + spolokKey);
  // }

  getClenovia(spolokId: string): Observable<OsobaView[]> {
    return this.get(this.base + 'persons/' + spolokId).pipe(
      map((poslanci: Osoba[]) => poslanci.map(p => this.mapOsoba(p)))
    )
    // return this.get(this.base + 'clenovia/' + spolokKey).pipe(
    //   map((poslanci: Osoba[]) => poslanci.map(p => this.mapOsoba(p)))
    // );
  }

  getUznesenia(spolokId: string): Observable<Uznesenie[]> {
    return this.get(this.base + 'resolutions/' + spolokId).pipe(
      map((list: Uznesenie[]) => list.sort((a, b) => b.cislo - a.cislo))
    )
  }

  getUznesenie(uznesenieId: number): Observable<Uznesenie> {
    return this.get(this.base + 'resolution/' + uznesenieId);
  }

  // getInterpelacie(spolokKey: string, previous = false): Observable<Interpelacia[]> {
  //   return this.get(this.base + spolokKey + '/interpelacie' + (previous ? '?previous=true' : ''));
  // }

  // getInterpelacia(interpelaciaId: number): Observable<Interpelacia> {
  //   return this.get(this.base + 'interpelacia/' + interpelaciaId);
  // }

  getPoslanec(osobaId: number): Observable<OsobaView> {
    return this.get(this.base + 'person/' + osobaId).pipe(
      map((poslanec: Osoba) => this.mapOsoba(poslanec))
    )
  }

  mapOsoba(poslanec: Osoba): OsobaView {
    const personView = new OsobaView();
    personView.id = poslanec.id;
    personView.name = poslanec.name;
    personView.prefix = poslanec.prefix;
    personView.suffix = poslanec.suffix;
    personView.role = poslanec.role;
    personView.commissions = [];
    if (poslanec.election) {
      personView.elections = poslanec.election
        .filter(e => e.period.endsWith('2022'))
        .map(e => {
          const council = spolky.find(s => s.id === e.council);
          const electionView = new ElectionView();
          electionView.title = e.mayor ? council.mayorTitle : council.title;
          electionView.councilName = council.meno;
          electionView.period = e.period;
          electionView.party = e.party;
          electionView.commission = [];
          return electionView;
        });
    }
    if (poslanec.commission) {
      const currentCommissions = poslanec.commission.filter(e => e.period.endsWith('2022'));
      let selectedCommission = currentCommissions.shift();
      while (selectedCommission) {
        const c = new CommissionView();
        const council = spolky.find(s => s.id === selectedCommission.council);
        c.councilName = council.meno;
        c.name = council.commission.find(cc => cc.id === selectedCommission.fk).name;
        c.chairman = selectedCommission.chairman;
        c.period = selectedCommission.period;
        if (poslanec.election) {
          const election = personView.elections.find(e => e.councilName == c.councilName && e.period == c.period);
          if (election) {
            election.commission.push(c);
          } else {
            personView.commissions.push(c);
          }
        } else {
          personView.commissions.push(c);
        }
        selectedCommission = currentCommissions.shift();
      }
    }
    if (poslanec.departments) {
      personView.departments = poslanec.departments.map(d => {
        const council = spolky.find(s => s.id === d.council);
        const departmentView = new DepartmentView();
        const councilDepartment = council.department.find(cd => cd.id === d.department)
        departmentView.title = councilDepartment.name;
        const councilDepartmentRole = councilDepartment.role.find(r => r.id === d.role);
        departmentView.role = councilDepartmentRole.name;
        departmentView.icon = councilDepartmentRole.icon;
        return departmentView;
      });
    }
    return personView;
  }

  getRozpocet(spolokId: number): Observable<Rozpocet> {
    return this.get(this.base + 'budget/' + spolokId).pipe(
      map((r: Rozpocet) => this.mapRozpocet(r))
    )
  }

  mapRozpocet(r: Rozpocet): Rozpocet {
      r.vydavky.forEach(element =>
        this.setCurrentMoney(element)
      );
      r.prijmy.forEach(element =>
        this.setCurrentMoney(element)
      );
      r.current = this.getCurrectYear(r.sumar)
    return r;
  }

  setCurrentMoney(elem: any) {
    elem.current = this.getCurrectYear(elem.money)
    elem.sub.forEach(sub =>
      this.setCurrentMoney(sub)
    )
  }

  getCurrectYear(list: any) {
    return list[0]
  }

  // getVystavba(spolokKey: string): Observable<Vystavba[]> {
  //   return this.get(this.base + spolokKey + '/vystavba');
  // }

  // getStavba(stavbaId: number): Observable<Vystavba> {
  //   return this.get(this.base + 'vystavba/' + stavbaId);
  // }

  // getCiele(spolokKey: string): Observable<Ciel[]> {
  //   return this.get(this.base + spolokKey + '/ciele');
  // }

  private handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error.message);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong,
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    // return an observable with a user-facing error message
    return throwError(
      'Something bad happened; please try again later.');
  }

}
