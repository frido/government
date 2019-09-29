import { Component, Input, OnInit  } from '@angular/core';
import { IconResultService } from '../../icon-result.service';
import { ApiService } from '../../../../api.service';

@Component({
  selector: 'app-icon-result',
  templateUrl: './icon-result.component.html'
})
export class IconResultComponent implements OnInit {
  @Input() vysledok: Vysledok[];
  classes: string[];

  constructor(private service: ApiService, private icons: IconResultService) {}

  ngOnInit(): void {
    this.classes = this.vysledok.map(v => this.icons.getIconClass(v.title));
  }
}
