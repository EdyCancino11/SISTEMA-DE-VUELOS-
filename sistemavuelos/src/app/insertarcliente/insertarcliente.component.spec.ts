import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InsertarclienteComponent } from './insertarcliente.component';

describe('InsertarclienteComponent', () => {
  let component: InsertarclienteComponent;
  let fixture: ComponentFixture<InsertarclienteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [InsertarclienteComponent]
    });
    fixture = TestBed.createComponent(InsertarclienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
