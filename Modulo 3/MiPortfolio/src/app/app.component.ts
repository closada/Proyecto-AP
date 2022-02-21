import { Component , OnInit, Input } from '@angular/core';
import { PortfolioService } from 'src/app/services/portfolio.service';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MiPortfolio';
  section:any;


}
