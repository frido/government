import { Component, Input, OnInit  } from '@angular/core';
import { ApiService } from '../../../../api.service';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';

@Component({
  selector: 'app-poslanec-meno',
  templateUrl: './poslanec-meno.component.html'
})
export class PoslanecMenoComponent implements OnInit {
  @Input() poslanecId: number;
  poslanec: OsobaView;

  constructor(private service: ApiService) {}

  ngOnInit(): void {
    this.service.getPoslanec(this.poslanecId).subscribe(body => {
      this.poslanec = body;
    });
  }
}
