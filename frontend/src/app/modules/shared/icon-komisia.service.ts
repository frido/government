import { Injectable } from '@angular/core';

// TODO: Deprecated
@Injectable({
  providedIn: 'root',
})
export class IconKomisiaService {

  private icons: { [key: string]: string } = {
    'Mandátová komisia' : 'fas fa-pen-nib',
    'Komisia finančná' : 'fas fa-money-bill-wave',
    'Komisia investičných činností' : 'fas fa-chart-area',
    'Komisia správy majetku a miestnych podnikov' : 'fas fa-hammer',
    'Komisia územného plánu, výstavby a dopravy' : 'fas fa-map',
    'Komisia životného prostredia a verejného poriadku' : 'fas fa-tree',
    'Komisia sociálna a bytová' : 'fas fa-house-damage',
    'Komisia kultúry a mládeže' : 'fas fa-theater-masks',
    'Komisia športu' : 'fas fa-futbol',
    'Komisia školská' : 'fas fa-graduation-cap',
    'Komisia na ochranu verejného záujmu pri výkone funkcií' : 'fas fa-shield-alt',
    'Miestna rada': 'fas fa-users',
    'Sobášiaci': 'fas fa-ring',
    'Komisia školstva, mládeže a športu': 'fas fa-graduation-cap',
    'Komisia na ochranu verejného záujmu': 'fas fa-shield-alt',
    'Komisia kultúry': 'fas fa-theater-masks',
    'Dotačná komisia': 'fas fa-donate',
    'Komisia zdravotníctva a sociálnych vecí': 'fas fa-medkit',
    'Komisia životného prostredia, regionálneho rozvoja a územného plánovania': 'fas fa-tree',
    'Komisia majetku, investícií a verejného obstarávania': 'fas fa-chart-area',
    'Finančná komisia': 'fas fa-money-bill-wave',
    'Komisia európskych záležitostí, regionálnej spolupráce a cestovného ruchu': 'fas fa-globe',
    'Komisia mandátová' : 'fas fa-pen-nib',
    'Komisia pre školstvo, vzdelávanie a šport' : 'fas fa-graduation-cap',
    'Komisia na ochranu verejného záujmu pri výkone funkcií verejných funkcionárov' : 'fas fa-shield-alt',
    'Komisia kultúry, opravy historických pamiatok a mediálna komisia' : 'fas fa-theater-masks',
    'Komisia územného a strategického plánovania, životného prostredia a výstavby' : 'fas fa-map',
    'Komisia dopravy a informačných systémov' : 'fas fa-bus-alt',
    'Mestská rada' : 'fas fa-users'
  };

  getIconClass(key: string): string {
    return this.icons[key] || 'fas fa-bullseye';
  }
}
