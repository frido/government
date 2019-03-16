import { Injectable } from '@angular/core';

export interface IconType {
  key: string;
  title: string;
  class: string;
}

@Injectable({
  providedIn: 'root',
})
export class IconTypeService {

  private icons: IconType[] = [
    { 'key': 'najom', 'title': 'Nájom', 'class': 'far fa-building' },
    { 'key': 'ine', 'title': 'Iné', 'class': 'far fa-lightbulb' },
    { 'key': 'peticia', 'title': 'Petícia', 'class': 'far fa-clipboard' },
    { 'key': 'info', 'title': 'Informácie', 'class': 'far fa-chart-bar' },
    { 'key': 'ziadost', 'title': 'Žiadosť', 'class': 'far fa-hand-peace' },
    { 'key': 'kontrola', 'title': 'Kontrola', 'class': 'far fa-check-square' },
    { 'key': 'projekt', 'title': 'Projekt', 'class': 'far fa-star' },
    { 'key': 'prevod', 'title': 'Prevod', 'class': 'far fa-money-bill-alt' },
    { 'key': 'uzemie', 'title': 'Územie', 'class': 'far fa-map' },
    { 'key': 'obstaranie', 'title': 'Obstaranie', 'class': 'far fa-paper-plane' },
    { 'key': 'vzn', 'title': 'VZN', 'class': 'far fa-list-alt' },
    { 'key': 'rozpocet', 'title': 'Rozpočet', 'class': 'far fa-money-bill-alt' },
    { 'key': 'delegovanie', 'title': 'Delegovanie', 'class': 'far fa-lightbulb' }
  ];

  getIcon(key: string): IconType {
    return this.icons.find( x => x.key === key);
  }

  getIcons(): IconType[] {
    return this.icons;
  }

  getIconKeys(): string[] {
    return this.icons.map( i => i.key);
  }
}
