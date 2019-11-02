import { Component, Input, OnInit } from '@angular/core';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';
import { Observable } from 'rxjs/internal/Observable';
import { ApiService } from 'src/app/api.service';

@Component({
  selector: 'app-poslanec-detail',
  templateUrl: './poslanec-detail.component.html'
})
export class PoslanecDetailComponent implements OnInit {
  @Input() poslanec: OsobaView;
  resolutions: Uznesenie[];

  constructor(private service: ApiService) { }

  ngOnInit() {
    this.service.getUzneseniaCreator(this.poslanec.id).subscribe(data => this.resolutions = data);
  }
}


