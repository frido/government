import { Directive, HostListener } from '@angular/core';
import { Location } from '@angular/common';

@Directive({ selector: '[appBacklink]' })
export class BacklinkDirective {
    constructor(private location: Location) { }

    @HostListener('click') onMouseLeave() {
        this.location.back();
    }
}
