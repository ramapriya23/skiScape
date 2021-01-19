import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ski-suggestions',
  templateUrl: './ski-suggestions.component.html',
  styleUrls: ['./ski-suggestions.component.css']
})
export class SkiSuggestionsComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  goToLink(image){
    if(image == 1)
    window.open("https://www.skis.com/Dynastar-Menace-90-Skis-with-Xpress-11-GW-Bindings/609084P,default,pd.html", "_blank");
    if(image == 2)
      window.open("https://www.skis.com/Salomon-S-Force-7-Skis-with-M11-GW-Bindings/612461P,default,pd.html", "_blank");
    if(image ==3)
      window.open("https://www.skis.com/Fischer-RC4-The-Curv-DTX-2019/600436P,default,pd.html","_blank")
  }
}
