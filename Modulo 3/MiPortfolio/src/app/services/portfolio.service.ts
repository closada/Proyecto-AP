import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PortfolioService {

  constructor(private http:HttpClient) { }

  objenerDatos():Observable<any>{
    return this.http.get('./assets/data/data.json');
  }
//
//  delete(section:any):Observable<any>{
//    return 
//  }
}
