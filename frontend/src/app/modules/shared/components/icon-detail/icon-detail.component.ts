import { Component, Input, OnInit  } from '@angular/core';
import { ApiService } from '../../../../api.service';
import { IconResultService } from '../../icon-result.service';

@Component({
  selector: 'app-icon-detail',
  templateUrl: './icon-detail.component.html',
  styleUrls: ['./icon-detail.component.scss']
})
export class IconDetailComponent {
  @Input() vysledok: Array<any>;
  @Input() predkladatelId: Array<number>;
  classes: Array<String>;

  constructor(private service: ApiService, private icons: IconResultService) {}

  public getClass(key: string): string {
    return this.icons.getIconClass(key);
  }
}
