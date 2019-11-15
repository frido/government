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
    { 'key': 'info', 'title': 'Infomácia', 'class': 'fas fa-info-circle' },
    { 'key': 'delegovanie', 'title': 'Voľba', 'class': 'fas fa-users' },
    { 'key': 'plat', 'title': 'Plat', 'class': 'fas fa-wallet' },
    { 'key': 'stanovisko', 'title': 'Stanovisko', 'class': 'fas fa-file-contract' },
    { 'key': 'rozpocet', 'title': 'Rozpočet', 'class': 'fas fa-piggy-bank' },
    { 'key': 'vzn', 'title': 'VZN', 'class': 'fas fa-gavel' },
    { 'key': 'zasady', 'title': 'Zásady', 'class': 'fas fa-scroll' },
    { 'key': 'projekt', 'title': 'Projekt', 'class': 'fas fa-project-diagram' },
    { 'key': 'grants', 'title': 'Dotácia', 'class': 'fas fa-gift' },
    { 'key': 'plan', 'title': 'Plán', 'class': 'fas fa-paper-plane' },
    { 'key': 'peticia', 'title': 'Petícia', 'class': 'fas fa-feather-alt' },
    { 'key': 'najom', 'title': 'Prenájom', 'class': 'fas fa-warehouse' },
    { 'key': 'predaj', 'title': 'Predaj', 'class': 'fas fa-shopping-bag' },
    { 'key': 'nakup', 'title': 'Nákup', 'class': 'fas fa-shopping-bag' },
    { 'key': 'pozemky', 'title': 'Pozemky', 'class': 'fas fa-layer-group' },
    { 'key': 'pravidelne', 'title': 'Pravidelné', 'class': 'fas fa-calendar-check' },
    { 'key': 'rozne', 'title': 'Rôzne', 'class': 'fas fa-pen-nib' },
    { 'key': 'ine', 'title': 'Iné', 'class': 'fas fa-pencil-ruler' }
  ];

  getIcon(key: string): IconType {
    console.log(key);
    return this.icons.find( x => x.key === key);
  }

  getIcons(): IconType[] {
    return this.icons;
  }

  getIconKeys(): string[] {
    return this.icons.map( i => i.key);
  }
}
