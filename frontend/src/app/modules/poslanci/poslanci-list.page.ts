import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { Observable } from 'rxjs';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';
import { Option } from '../shared/components/filter/filter.component';

@Component({
  templateUrl: './poslanci-list.page.html'
})
export class PoslanciListPage implements OnInit {
  $poslanci: Observable<OsobaView[]>;

  optionsRole: Option[] = [{ value: null, label: '' }];
  selectedRoleOption: Option = this.optionsRole[0];

  optionsCommision: Option[] = [{ value: null, label: '' }];
  selectedCommisionOption: Option = this.optionsCommision[0];

  optionsDepartment: Option[] = [{ value: null, label: '' }];
  selectedDepartmentOption: Option = this.optionsDepartment[0];

  spolok: Spolok = null;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {
    this.spolok = this.route.snapshot.data.spolok; // TODO: commissions not from this spolok
    this.spolok.commission.forEach(c => {
      this.optionsCommision.push({value: c.id.toString(), label: c.name})
    })

    this.spolok.department.forEach(c => {
      this.optionsDepartment.push({value: c.id.toString(), label: c.name})
    })

    //this.filterRole.add({flag: true, icon: 'fas fa-chess-king', key: '4', title: 'Starosta'})
    this.optionsRole.push({value: '2', label: 'Zamestnanci MÚ'})
    this.optionsRole.push({value: '1', label: 'Poslanci'})
    this.optionsRole.push({value: '3', label: 'Mestske organizacie'})

    this.$poslanci = this.service.getClenovia("" + this.spolok.id);
  }

  onFilterRole(option: Option) {
    this.selectedRoleOption = option;
  }

  onFilterCommision(option: Option) {
    this.selectedCommisionOption = option;
  }

  onFilterDepartment(option: Option) {
    this.selectedDepartmentOption = option;
  }

  isVisible(osoba: OsobaView): boolean {
    const selectedCommision = this.selectedCommisionOption.value;
    const selectedDepartment = this.selectedDepartmentOption.value;
    const selectedRole = this.selectedRoleOption.value;
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
