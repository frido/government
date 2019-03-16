import { Component, Input, OnInit  } from '@angular/core';

@Component({
  selector: 'app-vystavba',
  templateUrl: './vystavba.component.html'
})
export class VystavbaComponent {
  @Input() vystavba: Vystavba;
  opened = false;
}
