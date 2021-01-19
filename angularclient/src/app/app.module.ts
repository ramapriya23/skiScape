import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TitleBarComponent } from './components/title-bar/title-bar.component';
import { PageContentComponent } from './components/page-content/page-content.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatCardModule} from '@angular/material/card'
import {MatInputModule} from '@angular/material/input'
import {MatRadioModule, MAT_RADIO_DEFAULT_OPTIONS } from '@angular/material/radio'
import {MatButtonModule} from '@angular/material/button'
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {MatSelectModule} from "@angular/material/select";
import {ReactiveFormsModule} from "@angular/forms";
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { SkiSuggestionsComponent } from './components/ski-suggestions/ski-suggestions.component';

@NgModule({
  declarations: [
    AppComponent,
    TitleBarComponent,
    PageContentComponent,
    SkiSuggestionsComponent,
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        BrowserAnimationsModule,
        MatCardModule,
        MatInputModule,
        MatRadioModule,
        MatButtonModule,
        FormsModule,
        HttpClientModule,
        MatSelectModule,
      ReactiveFormsModule,
      FontAwesomeModule
    ],
  providers: [{provide: MAT_RADIO_DEFAULT_OPTIONS, useValue: {color : 'primary'}}],
  bootstrap: [AppComponent]
})
export class AppModule { }
