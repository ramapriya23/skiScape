import { Component, OnInit } from '@angular/core';
import {SkiType} from "../../models/SkiType";
import {SkiRecommendService} from "../../services/ski-recommend.service";
import {UserInfo} from "../../models/UserInfo";
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {ValidateFn} from "codelyzer/walkerFactory/walkerFn";
import {faExclamationCircle} from "@fortawesome/free-solid-svg-icons"
@Component({
  selector: 'app-page-content',
  templateUrl: './page-content.component.html',
  styleUrls: ['./page-content.component.css']
})
export class PageContentComponent implements OnInit {
  //userInfo : UserInfo
  userInfo = new FormGroup({
    height : new FormControl(null,[Validators.pattern('^[0-9]*$')]),
    age : new FormControl(null,[Validators.pattern('^[0-9]*$')]),
    type : new FormControl(null)
  })
  warn = faExclamationCircle;
  message : string
  skiLengthResult : string
  constructor(public skiRecommendService : SkiRecommendService) {

  }

  ngOnInit(): void {
    this.message= null;
    this.skiRecommendService.skiLength$.subscribe(res => {
      this.skiLengthResult = res[0] + " - " + res[res.length-1]
    })
  }

  findSkiSize() {
    if(this.userInfo.controls.height.value == null || this.userInfo.controls.age.value == null || this.userInfo.controls.type.value === null)
      this.message = "All fields are mandatory";
    else {
      this.message = null
      this.skiRecommendService.getSkiLength(this.userInfo)
    }
  }

}
