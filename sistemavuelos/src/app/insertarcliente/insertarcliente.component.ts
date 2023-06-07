import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-insertarcliente',
  templateUrl: './insertarcliente.component.html',
  styleUrls: ['./insertarcliente.component.css']
})
export class InsertarclienteComponent {

  nuevoCliente: any = {};

  constructor(private http: HttpClient) {}

  agregarCliente() {
    this.http.post('http://localhost:8080/clientes/', this.nuevoCliente)
      .subscribe(response => {
        console.log('Cliente agregado:', response);
        // Restablecer el formulario
        this.nuevoCliente = {};
      }, error => {
        console.error('Error al agregar cliente:', error);
      });
  }
}