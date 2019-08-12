import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

import { MenuComponent } from './menu/menu.component';
import { IconTypeComponent } from './icon-type/icon-type.component';
import { IconResultComponent } from './icon-result/icon-result.component';
import { IconDetailComponent } from './icon-detail/icon-detail.component';
import { UznesenieComponent } from './uznesenie/uznesenie.component';
import { UznesenieDetailComponent } from './uznesenie-detail/uznesenie-detail.component';
import { InterpelaciaComponent } from './interpelacia/interpelacia.component';
//import { PoslanecComponent } from../../poslanci/poslanec.componentnt';
import { InterpelaciaDetailComponent } from './interpelacia-detail/interpelacia-detail.component';
import { TabComponent } from './tabs/tab.component';
import { TabsComponent } from './tabs/tabs.component';
import { PoslanecMenoComponent } from './poslanec-meno/poslanec-meno.component';
import { PoslanecClickableComponent } from './poslanec-clickable/poslanec-clickable.component';
import { IconKomisiaComponent } from './icon-komisia/icon-komisia.component';
import { VtabComponent } from './vtabs/vtab.component';
import { VtabsComponent } from './vtabs/vtabs.component';
import { FooterComponent } from './footer/footer.component';
import { BacklinkDirective } from './backlink/backlink.directive';
import { LinkableComponent } from './linkable/linkable.component';
import { ExternalLinkComponent } from './external-link/external-link.component';
import { PoslanecResultComponent } from './poslanec-result/poslanec-result.component';
import { FilterComponent } from './filter/filter.component';
import { SearchComponent } from './search/search.component';
import { SelectComponent } from './select/select.component';
//import { PoslanecDetailComponent } from '../../poslanci/poslanec-detail.component';

@NgModule({
  declarations: [
    MenuComponent, IconTypeComponent, IconResultComponent, UznesenieComponent, UznesenieDetailComponent,
    IconDetailComponent, InterpelaciaComponent, FilterComponent, SearchComponent, SelectComponent, InterpelaciaDetailComponent,
    TabComponent, TabsComponent, PoslanecMenoComponent, PoslanecClickableComponent, IconKomisiaComponent,
    VtabComponent, VtabsComponent, FooterComponent, BacklinkDirective, LinkableComponent, ExternalLinkComponent,
    PoslanecResultComponent
  ],
  exports: [
    MenuComponent, IconTypeComponent, IconResultComponent, UznesenieComponent, UznesenieDetailComponent,
    IconDetailComponent, InterpelaciaComponent, FilterComponent, SearchComponent, SelectComponent, InterpelaciaDetailComponent,
    TabComponent, TabsComponent, PoslanecMenoComponent, PoslanecClickableComponent, IconKomisiaComponent,
    VtabComponent, VtabsComponent, FooterComponent, BacklinkDirective, LinkableComponent, ExternalLinkComponent,
    PoslanecResultComponent
  ],

  imports: [
    RouterModule,
    FormsModule,
    CommonModule
  ]
})
export class SharedModule { }
