import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-external-link',
  template: `
    <a href="{{href}}" target="blank"><i class="fas fa-external-link-alt"></i></a>
  `
})
export class ExternalLinkComponent {
  @Input() href: string;

  constructor() { }

}
