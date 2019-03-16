import { Component, Input, OnInit  } from '@angular/core';
import { IconResultService } from '../../icon-result.service';
import { ApiService } from '../../../../api.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-interpelacia-detail',
  templateUrl: './interpelacia-detail.component.html'
})
export class InterpelaciaDetailComponent implements OnInit {
  @Input() interpelacia: Interpelacia;
  spolok: Spolok;

  constructor(private route: ActivatedRoute) {}

  ngOnInit() {
    this.spolok = this.route.snapshot.data.spolok;
  }

}
