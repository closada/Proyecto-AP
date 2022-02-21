import { Component, OnInit , Input} from '@angular/core';
import { PortfolioService } from 'src/app/services/portfolio.service';
import { faEdit } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-profile-info',
  templateUrl: './profile-info.component.html',
  styleUrls: ['./profile-info.component.css']
})
export class ProfileInfoComponent implements OnInit {
  miPortfolio:any= [];
  faEdit = faEdit;
  
  constructor(private datosPortfolio:PortfolioService) { }

  ngOnInit(): void {
    this.datosPortfolio.objenerDatos().subscribe(data => {
      
      this.miPortfolio = data;
    });
  }

}
