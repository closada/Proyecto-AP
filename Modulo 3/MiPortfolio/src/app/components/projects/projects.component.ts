import { Component, OnInit } from '@angular/core';
import { PortfolioService } from 'src/app/services/portfolio.service';
import { faGithub } from '@fortawesome/free-brands-svg-icons';

@Component({
  selector: 'app-projects',
  templateUrl: './projects.component.html',
  styleUrls: ['./projects.component.css']
})
export class ProjectsComponent implements OnInit {
proyList:any;
faGit = faGithub;

  constructor(private datosPortfolio:PortfolioService) { }

  ngOnInit(): void {
    this.datosPortfolio.objenerDatos().subscribe(data => {
      
      this.proyList = data.proyects;
      
      
    });
  }

}
