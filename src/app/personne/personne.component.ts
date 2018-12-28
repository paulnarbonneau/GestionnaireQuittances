import { Component, OnInit } from '@angular/core';
import { GestionService } from '../gestion.service';
import { Personne } from '../personne.model';

@Component({
  selector: 'app-personne',
  templateUrl: './personne.component.html',
  styleUrls: ['./personne.component.scss']
})
export class PersonneComponent implements OnInit {

  constructor(private gestionService : GestionService) {  }

  personnes : Personne[];

  ngOnInit() {

    console.log('appel Init');
    this.gestionService.getAllPersonne().subscribe((data) => this.personnes = data , (error)=> console.log(error));

  }

}
