import { Component, OnInit } from '@angular/core';
import { PortfolioService } from 'src/app/services/portfolio.service';
import { faInstagram , faLinkedin} from '@fortawesome/free-brands-svg-icons';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
miPortfolio:any;
faIns = faInstagram;
falink = faLinkedin;

constructor(private datosPortfolio:PortfolioService) { }

  ngOnInit(): void {
    this.datosPortfolio.objenerDatos().subscribe(data => {
      
      this.miPortfolio = data;
    });
  }

  toggleFormLogueo(){
    console.log("ver");
  }
}
