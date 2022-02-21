import { Component, OnInit , Input , EventEmitter, Output} from '@angular/core';

@Component({
  selector: 'app-button-log',
  templateUrl: './button-log.component.html',
  styleUrls: ['./button-log.component.css']
})
export class ButtonLogComponent implements OnInit {

@Input() text:string = "";
@Input() color:string = "";
@Output() btnClick = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }


  onClick(){
    this.btnClick.emit();
  }
}
