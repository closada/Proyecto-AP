const ctx = document.getElementById('myChartSS').getContext('2d');
const myChart = new Chart(ctx, {
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
                'grey',
                'grey',
                'grey',
                'grey',
                'grey',
                'grey',
                'grey'
            ],
            borderWidth: 1,
            hoverOffset: 4,
           
            
        }]
    },
    options: {
        legend: {
            position: 'left',
                 
        },
        
        
    }
});

const ctx2 = document.getElementById('myChartHS').getContext('2d');
const myChart2 = new Chart(ctx2, {
    type: 'doughnut',
    data: {
        labels: [   'HTML', 
                    'CSS' , 
                    'JavaScript' , 
                    'TypeScript' , 
                    'JSON' , 
                    'Angular' , 
                    'C' , 
                    'C++' , 
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
                'grey',
                'grey',
                'grey',
                'grey',
                'grey',
                'grey',
                'grey',
                'grey',
                'grey'
                
            ],
            borderWidth: 1,
            hoverOffset: 4,
           
            
        }]
    },
    options: {
        legend: {
            position: 'right',
                 
        },
        
        
    }
});
