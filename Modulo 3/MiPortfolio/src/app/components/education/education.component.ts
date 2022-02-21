import { Component, OnInit } from '@angular/core';
import { PortfolioService } from 'src/app/services/portfolio.service';
import { faEdit , faTrashAlt } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-education',
  templateUrl: './education.component.html',
  styleUrls: ['./education.component.css']
})
export class EducationComponent implements OnInit {
eduList:any;
achList:any;
achImg:any;
faEdit = faEdit;
faTrash = faTrashAlt;

  constructor(private datosPortfolio:PortfolioService) { }

  ngOnInit(): void {
    this.datosPortfolio.objenerDatos().subscribe(data => {
      
      this.eduList = data.education;
      this.achImg = data.educAchievImg;
      this.achList = data.educAchiev;
    });
  }

}
