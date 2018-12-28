import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { LocationStrategy, HashLocationStrategy } from '@angular/common';
import { PersonneComponent } from './personne/personne.component';
import { AppartementComponent } from './appartement/appartement.component';
import { QuittanceComponent } from './quittance/quittance.component';
import { AppRoutingModule } from './app-routing.module';
import { RouterModule, PreloadAllModules, ROUTES } from '@angular/router';
import { MenuComponent } from './menu/menu.component';

@NgModule({
  declarations: [
    AppComponent,
    PersonneComponent,
    AppartementComponent,
    QuittanceComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule, HttpClientModule, AppRoutingModule
  ],
  providers: [ { provide: LocationStrategy, useClass: HashLocationStrategy } ],
  bootstrap: [AppComponent]
})
export class AppModule { }
