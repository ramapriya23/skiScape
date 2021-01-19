import { TestBed } from '@angular/core/testing';

import { SkiRecommendService } from './ski-recommend.service';

describe('SkiRecommendService', () => {
  let service: SkiRecommendService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SkiRecommendService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
