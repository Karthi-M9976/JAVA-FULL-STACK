import { style } from '@angular/animations';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  flag:boolean;
  vehicles : string[];
  SelectedVehicle : string=" ";
  myStyle={};
  
  constructor(){
  this.flag=true;
  this.vehicles=["car","bike","bus"];
  this.myStyle={'width':'40%' ,'border' : '2px solid green'};
  }
  changeFlag(){
    this.flag=!this.flag;
  }
  setSelectedItem(vec : string) {
    this.SelectedVehicle =vec;
  }
}

