import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class IconResultService {

  private icons: { [key: string]: string } = {
    'schvaľuje' : 'fa-check',
    'vyhovuje' : 'fas fa-thumbs-up',
    'súhlasí' : 'fas fa-thumbs-up',
    'berie na vedomie' : 'fa-feather-alt',
    'žiada' : 'fa-tasks',
    'zriaďuje' : 'fa-cog',
    'ukladá' : 'fa-fist-raised',
    'neberie na vedomie' : 'fas fa-times',
    'neschvaľuje' : 'fas fa-times',
    'stiahnute' : 'fas fa-times',
    'konštatuje' : 'fas fa-pencil-ruler'
  };

  getIconClass(key: string): string {
    return this.icons[key] || 'fa-bullseye';
  }
}
