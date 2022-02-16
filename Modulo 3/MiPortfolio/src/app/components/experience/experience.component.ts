import { Component, OnInit } from '@angular/core';
import { PortfolioService } from 'src/app/services/portfolio.service';

@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css']
})
export class ExperienceComponent implements OnInit {
  expList:any;

  constructor(private datosPortfolio:PortfolioService) { }
  
  ngOnInit(): void {
    this.datosPortfolio.objenerDatos().subscribe(data => {
      
      this.expList = data.experience;
    });


  }


}
