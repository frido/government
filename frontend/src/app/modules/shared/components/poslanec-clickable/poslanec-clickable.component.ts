import { Component, Input, OnInit  } from '@angular/core';
import { ApiService } from '../../../../api.service';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-poslanec-clickable',
  template: `
    <app-linkable *ngIf="$poslanec | async as poslanec" section="poslanci" [id]="poslanecId" [text]="poslanec.name"></app-linkable>
  `
})
export class PoslanecClickableComponent implements OnInit {
  @Input() poslanecId: number;
  $poslanec: Observable<OsobaView>;

  constructor(private service: ApiService) {}

  ngOnInit(): void {
    this.$poslanec = this.service.getPoslanec(this.poslanecId);
  }
}
