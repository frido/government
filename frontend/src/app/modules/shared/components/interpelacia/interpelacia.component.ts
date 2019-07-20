import { Component, Input, OnInit, AfterViewInit, OnDestroy, ElementRef  } from '@angular/core';
import { ApiService } from '../../../../api.service';

@Component({
  selector: 'app-interpelacia',
  templateUrl: './interpelacia.component.html'
})
export class InterpelaciaComponent implements AfterViewInit, OnDestroy {
  @Input() interpelacia: Interpelacia;
  opened = false;

  ngAfterViewInit() {
    // this.ripple = new MDCRipple(this.myElement.nativeElement.querySelectorAll('.test'));
  }

  ngOnDestroy() {

  }

  constructor(public myElement: ElementRef, private service: ApiService) { }
}
