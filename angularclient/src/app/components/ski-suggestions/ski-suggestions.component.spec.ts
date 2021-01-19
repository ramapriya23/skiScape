import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SkiSuggestionsComponent } from './ski-suggestions.component';

describe('SkiSuggestionsComponent', () => {
  let component: SkiSuggestionsComponent;
  let fixture: ComponentFixture<SkiSuggestionsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SkiSuggestionsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SkiSuggestionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
