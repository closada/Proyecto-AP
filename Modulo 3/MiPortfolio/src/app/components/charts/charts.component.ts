import { Component, OnInit } from '@angular/core';
import { PortfolioService } from 'src/app/services/portfolio.service';
import { Chart, registerables } from 'chart.js';
Chart.register(...registerables);



@Component({
  selector: 'app-charts',
  templateUrl: './charts.component.html',
  styleUrls: ['./charts.component.css']
})
export class ChartsComponent implements OnInit {

  SSkillsData: any;
  HSkillsData: any;
  

  constructor(private datosPortfolio: PortfolioService) { }

  ngOnInit(): void {

    this.datosPortfolio.objenerDatos().subscribe(data => {

      this.SSkillsData = data.SoftSkills;
      this.HSkillsData = data.HardSkills;

    });
    

    const canvas = <HTMLCanvasElement>document.getElementById('myChartSS');
    const ctx = canvas.getContext('2d');


    if (ctx !== null) {

      var myChart = new Chart(ctx, {
        type: 'doughnut',
        data: {
          labels: ['Resolución de problemas', 
          'Creatividad', 
          'Trabajo en equipo' , 
          'Responsabilidad', 
          'Autogestión', 
          'Comunicación efectiva', 
          'Adaptabilidad' ],
          datasets: [{
            label: 'Soft Skills',
            data: [15, 15, 10, 15, 20, 10, 15],
            backgroundColor: [
              'rgb(255, 99, 132)',
              'rgb(75, 192, 192)',
              'rgb(255, 205, 86)',
              'rgb(201, 203, 207)',
              'rgb(54, 162, 235)',
              '#bc8ed2',
              '#cbd983'
            ],
            borderColor: [
              'white',
              'white',
              'white',
              'white',
              'white',
              'white',
              'white'
            ],
            borderWidth: 1,
            hoverOffset: 4,
          }]
        },

        options: {

        }
      });
    }



    const canvas2 = <HTMLCanvasElement>document.getElementById('myChartHS');
    const ctx2 = canvas2.getContext('2d');
    if (ctx2 !== null) {

      var myChart2 = new Chart(ctx2, {
        type: 'doughnut',
        data: {
          labels: ['HTML',
            'CSS',
            'JavaScript',
            'TypeScript',
            'JSON',
            'Angular',
            'C',
            'C++',
            'Paquete Office'
          ],
          datasets: [{
            label: 'Soft Skills',
            data: [13, 13, 8, 7, 10, 10, 12, 12, 15],
            backgroundColor: [
              'rgb(255, 99, 132)',
              'rgb(75, 192, 192)',
              'rgb(255, 205, 86)',
              'rgb(201, 203, 207)',
              'rgb(54, 162, 235)',
              '#bc8ed2',
              '#cbd983',
              'rgb(203, 50, 52)',
              '#ff7514'
            ],
            borderColor: [
              'white',
              'white',
              'white',
              'white',
              'white',
              'white',
              'white',
              'white',
              'white'

            ],
            borderWidth: 1,
            hoverOffset: 4,
          }]
        },

        options: {

        }
      });
    }

  }


}
