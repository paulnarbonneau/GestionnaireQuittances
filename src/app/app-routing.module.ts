import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PersonneComponent } from './personne/personne.component';
import { RouterModule, Routes, PreloadAllModules } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: '/', pathMatch: 'full' },
  { path: 'personne', component: PersonneComponent }
];

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot( routes, { "useHash" : false , "preloadingStrategy": PreloadAllModules, "onSameUrlNavigation": "reload" })
  ],
  exports : [RouterModule]
})
export class AppRoutingModule { }


