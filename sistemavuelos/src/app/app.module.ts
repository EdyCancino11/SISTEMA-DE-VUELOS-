import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { ClienteComponent } from './cliente/cliente.component';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { ToastrModule } from 'ngx-toastr';
import { MenuComponent } from './menu/menu.component';
import { InsertarclienteComponent } from './insertarcliente/insertarcliente.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ClienteComponent,
    MenuComponent,
    InsertarclienteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ToastrModule.forRoot()
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
