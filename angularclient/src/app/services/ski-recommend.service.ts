import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Subject} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class SkiRecommendService {

  skiLength$ : Subject<any> = new Subject()
  constructor(public http : HttpClient) { }

  getSkiLength(userInfo){
    //this.http.post('/api/skiLength',userInfo.value).subscribe(res=> this.skiLength$.next(res))
    this.skiLength$.next([
      110,
      115,
      120
    ])
  }
}
