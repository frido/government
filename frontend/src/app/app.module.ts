import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { NgModule, LOCALE_ID } from '@angular/core';
import { CommonModule, registerLocaleData } from '@angular/common';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IntroPage } from './modules/intro/intro.page';
import { RozpocetModule } from './modules/rozpocet/rozpocet.module';

import localeSk from '@angular/common/locales/sk';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { StoreService } from './store.service';
import { NotFoundComponent } from './not-found.component';
import { ApiService } from './api.service';
import { MyRequestCache } from './request-cache';
import { CachingInterceptor } from './caching.interceptor';

registerLocaleData(localeSk, 'sk');

@NgModule({
  declarations: [
    AppComponent, IntroPage, NotFoundComponent
  ],
  imports: [
    BrowserAnimationsModule,
    RouterModule,
    AppRoutingModule,
    HttpClientModule,
    CommonModule,
  ],
  providers: [
    MyRequestCache,
    { provide: HTTP_INTERCEPTORS, useClass: CachingInterceptor, multi: true },
    {provide: LOCALE_ID, useValue: 'sk'},
    StoreService,
    ApiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
