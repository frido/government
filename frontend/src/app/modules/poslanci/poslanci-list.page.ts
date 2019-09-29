import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { Observable } from 'rxjs';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';
import { FilterHolder } from '../shared/components/filter/filter.component';

@Component({
  templateUrl: './poslanci-list.page.html'
})
export class PoslanciListPage implements OnInit {
  $poslanci: Observable<OsobaView[]>;
  filterRole: FilterHolder = new FilterHolder(false);
  filterCommision: FilterHolder = new FilterHolder(false);
  filterDepartment: FilterHolder = new FilterHolder(false);
  spolok: Spolok = null;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {
    this.spolok = this.route.snapshot.data.spolok;
    this.spolok.commission.forEach(c => {
      this.filterCommision.add({flag: false, icon: null, key: c.id.toString(), title: c.name})
    })

    this.spolok.department.forEach(c => {
      this.filterDepartment.add({flag: false, icon: null, key: c.id.toString(), title: c.name})
    })

    //this.filterRole.add({flag: true, icon: 'fas fa-chess-king', key: '4', title: 'Starosta'})
    this.filterRole.add({flag: false, icon: 'fas fa-user-lock', key: '2', title: 'Zamestnanci MÚ'})
    this.filterRole.add({flag: false, icon: 'fas fa-user-tie', key: '1', title: 'Poslanci'})
    this.filterRole.add({flag: false, icon: 'fas fa-user', key: '3', title: 'Mestske organizacie'})

    this.$poslanci = this.service.getClenovia("" + this.spolok.id);
  }

  onFilterRole(filter: FilterHolder) {
    this.filterRole = filter;
  }

  onFilterCommision(filter: FilterHolder) {
    this.filterCommision = filter;
  }

  onFilterDepartment(filter: FilterHolder) {
    this.filterDepartment = filter;
  }

  isVisible(osoba: OsobaView): boolean {
    const selectedCommision = this.filterCommision.selection();
    const selectedDepartment = this.filterDepartment.selection();
    const selectedRole = this.filterRole.selection();
    console.log(selectedCommision);
    console.log(selectedDepartment);
    console.log(selectedRole);
    console.log(osoba);
    return (
         (selectedRole == null || (selectedRole === '2' && this.isZamestnanec(osoba)) || (selectedRole === '1' && this.isPoslanec(osoba)) || (selectedRole === '3' && this.isDepartment(osoba)))
      && (selectedCommision == null || ( osoba.commissions != null && osoba.commissions.filter(c => c.fk.toString() === selectedCommision && c.councilId === this.spolok.id).length > 0 ))
      && (selectedDepartment == null || ( osoba.departments != null && osoba.departments.filter(c => c.fk.toString() === selectedDepartment && c.councilId === this.spolok.id).length > 0 ))
    );
  }

  private isZamestnanec(osoba: OsobaView){
    return osoba.offices != null && osoba.offices.filter(o => o.councilId == this.spolok.id).length > 0
  }

  private isPoslanec(osoba: OsobaView){
    return osoba.deputies != null && osoba.deputies.filter(o => o.councilId == this.spolok.id).length > 0
  }

  private isDepartment(osoba: OsobaView){
    return osoba.departments != null && osoba.departments.filter(o => o.councilId == this.spolok.id).length > 0
  }
}
