import { Component, Input, OnInit, AfterViewInit, OnDestroy, ElementRef  } from '@angular/core';
import { ApiService } from '../../../../api.service';
import {MDCRipple} from '@material/ripple';

@Component({
  selector: 'app-interpelacia',
  templateUrl: './interpelacia.component.html'
})
export class InterpelaciaComponent implements AfterViewInit, OnDestroy {
  @Input() interpelacia: Interpelacia;
  opened = false;

  ripple: MDCRipple;

  ngAfterViewInit() {
    // this.ripple = new MDCRipple(this.myElement.nativeElement.querySelectorAll('.test'));
  }

  ngOnDestroy() {
    if (this.ripple) {
      this.ripple.destroy();
      this.ripple = null;
    }
  }

  constructor(public myElement: ElementRef, private service: ApiService) { }
}
