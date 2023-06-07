import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username: string = '';
  password: string = '';
  showAlert: boolean = false;
  loginSuccess: boolean = false;

  

  constructor(private http: HttpClient, private toastr: ToastrService, private router: Router) { }


  login() {
    const loginData = { username: this.username, password: this.password };
    this.http.post<any>('http://localhost:8080/usuarios/login', loginData).subscribe(
      response => {
        if (response === 1) {
          alert('Inicio de sesion exitoso');
          this.router.navigateByUrl('/menu');

        } else {
          alert('Credenciales inválidas');
        }
      }, error => {
        console.error(error);
        alert('Ocurrió un error al procesar la solicitud');
      });

  }
  
  
}
