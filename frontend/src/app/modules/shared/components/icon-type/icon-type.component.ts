import { Component, Input, OnInit  } from '@angular/core';
import { IconTypeService } from '../../icon-type.service';

@Component({
  selector: 'app-icon-type',
  templateUrl: './icon-type.component.html'
})
export class IconTypeComponent implements OnInit {
  @Input() type: string;
  class: string;

  constructor(private icons: IconTypeService) {}

  ngOnInit(): void {
    const icon = this.icons.getIcon(this.type);
    if (icon) {
      this.class = icon.class;
    } else {
      this.class = this.icons.getIcon('xxx').class;
    }
  }
}
