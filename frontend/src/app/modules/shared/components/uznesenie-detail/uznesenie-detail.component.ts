import { Component, Input, OnInit } from '@angular/core';
import { IconResultService } from '../../icon-result.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-uznesenie-detail',
  templateUrl: './uznesenie-detail.component.html'
})
export class UznesenieDetailComponent implements OnInit {
  @Input() uznesenie: Uznesenie;
  @Input() popis = true;
  @Input() predkladatel = true;
  @Input() vote = true;
  @Input() sumar = true;
  @Input() footer = true;

  constructor(private route: ActivatedRoute, private icons: IconResultService) { }

  ngOnInit(): void {

  }

  getClass(key: string): string {
    return this.icons.getIconClass(key);
  }
}
