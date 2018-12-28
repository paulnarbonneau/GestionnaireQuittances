import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Personne } from './personne.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GestionService {

  host : string = 'http://localhost:8080/gestionnaireQuittances'
  version : string = '/v1';

  constructor(private http: HttpClient) { }


  getAllPersonne() : Observable<Personne[]>
  {

    return this.http.get<Personne[]>(this.host + this.version + '/personnes');
    
  }


}
