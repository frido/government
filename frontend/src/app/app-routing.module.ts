import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { IntroPage } from './modules/intro/intro.page';
import { StoreService } from './store.service';
import { NotFoundComponent } from './not-found.component';
import { Store2Service } from './store-2.service';

const routes: Routes = [
  {
    path: '',
    component: IntroPage
  },
  {
    path: ':spolok',
    resolve: {spolok: StoreService, spolok2: Store2Service},
    children: [
      {
        path: '',
        redirectTo: 'uznesenia',
        pathMatch: 'full'
      },
      { path: 'uznesenia',
        loadChildren: './modules/uznesenia/uznesenia.module#UzneseniaModule'
      },
      { path: 'poslanci',
        loadChildren: './modules/poslanci/poslanci.module#PoslanciModule'
      },
      { path: 'interpelacia',
        loadChildren: './modules/interpelacia/interpelacia.module#InterpelaciaModule'
      },
      { path: 'rozpocet',
        loadChildren: './modules/rozpocet/rozpocet.module#RozpocetModule'
      },
      { path: 'external',
        loadChildren: './modules/external/external.module#ExternalModule'
      },
      { path: 'vystavba',
        loadChildren: './modules/vystavba/vystavba.module#VystavbaModule'
      },
      { path: 'starosta',
        loadChildren: './modules/starosta/starosta.module#StarostaModule'
      }, {
        path: '**',
        component: NotFoundComponent
    }
    ]



  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
