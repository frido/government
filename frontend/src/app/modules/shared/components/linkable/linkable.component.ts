import { Component, Input, OnInit  } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-linkable',
  template: `
  <a class="linkable" [routerLink]="['/', spolok.key, section, 'show', id]" routerLinkActive="active">{{text}}</a>
  `
})
export class LinkableComponent implements OnInit {
  @Input() section: string;
  @Input() id: number;
  @Input() text: string;
  spolok: Spolok;

  constructor(private route: ActivatedRoute) {}

  ngOnInit() {
    this.spolok = this.route.snapshot.data.spolok;
  }
}
