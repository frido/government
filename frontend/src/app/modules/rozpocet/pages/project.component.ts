import { Component, Input } from '@angular/core';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html'
})
export class ProjectComponent {
  @Input() project: Project;
  opened = false;

  constructor() { }

}
