import { Component, Input, OnInit  } from '@angular/core';
import { IconKomisiaService } from '../../icon-komisia.service';

@Component({
  selector: 'app-icon-komisia',
  templateUrl: './icon-komisia.component.html'
})
export class IconKomisiaComponent implements OnInit {
  @Input() type: string;
  class: string;

  constructor(private icons: IconKomisiaService) {}

  ngOnInit(): void {
    this.class = this.icons.getIconClass(this.type);
  }
}
