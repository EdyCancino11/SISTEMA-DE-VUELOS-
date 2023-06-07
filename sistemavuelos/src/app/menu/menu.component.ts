import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent {
  constructor( private router: Router) { }

  handleButtonClick(buttonName: string) {
    switch (buttonName) {
      case 'Botón 1':
        this.router.navigateByUrl('/cliente');
        break;
      case 'Botón 2':
        console.log('Se presionó el Botón 2');
        break;
      case 'Botón 3':
        console.log('Se presionó el Botón 3');
        break;
      default:
        console.log('Botón no reconocido');
    }
  }

}
