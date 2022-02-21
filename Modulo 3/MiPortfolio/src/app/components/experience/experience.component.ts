import { Component, OnInit , Output , EventEmitter} from '@angular/core';
import { PortfolioService } from 'src/app/services/portfolio.service';
import { faEdit , faTrashAlt } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css']
})
export class ExperienceComponent implements OnInit {
  expList:any;
  faEdit = faEdit;
  faTrash = faTrashAlt;
  @Output() onDeletePart: EventEmitter<any> = new EventEmitter();

  constructor(private datosPortfolio:PortfolioService) { }
  
  ngOnInit(): void {
    this.datosPortfolio.objenerDatos().subscribe(data => {
      
      this.expList = data.experience;
    });

  
  }

  onDelete(exp:any){
    this.onDeletePart.emit(exp);
  }

}
