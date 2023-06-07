import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';


@Component({
  selector: 'app-vuelo',
  templateUrl: './cliente.component.html',
  styleUrls: ['./cliente.component.css']
})
export class ClienteComponent implements OnInit {
  vuelos: any[] = [];

  constructor(private http: HttpClient, private router: Router) {}

  ngOnInit() {
    this.obtenerClientes();
  }

  obtenerClientes() {
    this.http.get<any[]>('http://localhost:8080/clientes').subscribe(
      response => {
        this.vuelos = response;
      },
      error => {
        console.error('Error al obtener los clientes:', error);
      }
    );
  }

  editarVuelo(vuelo: any) {
    const url = `http://localhost:8080/clientes/${vuelo.idCliente}`;
    this.http.put(url, vuelo).subscribe(
      response => {
        alert('Vuelo editado:');
      },
      error => {
        alert('Error al editar el vuelo:');
      }
    );
  }

  eliminarVuelo(vuelo: any) {
    const url = `http://localhost:8080/clientes/${vuelo.idCliente}`;
    this.http.delete(url).subscribe(
      response => {
        alert('Vuelo eliminado:');
        this.obtenerClientes(); // Actualizar la lista de vuelos después de eliminar uno
      },
      error => {
        alert('Error al eliminar el vuelo:');
      }
    );
  }

  asignarVuelos() {
    this.router.navigateByUrl('/insertar');
  }
}
