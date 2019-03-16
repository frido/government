import { Injectable } from '@angular/core';
import { Observable, BehaviorSubject, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Resolve, ActivatedRouteSnapshot } from '@angular/router';
import { spolky } from './modules/shared/spolky';

@Injectable({
  providedIn: 'root',
})
export class Store2Service implements Resolve<Spolok> {

  constructor() {}

  resolve(route: ActivatedRouteSnapshot): Observable<Spolok> {
    const spolokKey = route.paramMap.get('spolok');
    const spolok = spolky.find(x => x.key === spolokKey);
    return of(spolok);
  }
}
