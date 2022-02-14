import { Component, OnInit } from '@angular/core';
import { PortfolioService } from 'src/app/services/portfolio.service';
import { Chart , ChartDataset } from 'chart.js';


@Component({
  selector: 'app-charts',
  templateUrl: './charts.component.html',
  styleUrls: ['./charts.component.css']
})
export class ChartsComponent implements OnInit {

gralData:any;


  constructor(private datosPortfolio:PortfolioService) { }

  ngOnInit(): void {
    
    this.datosPortfolio.objenerDatos().subscribe(data => {
      
      this.gralData = data.skills;
      
      
    });
  }


}
