const ctx = document.getElementById('myChart').getContext('2d');
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
            data: [15, 15, 10, 15, 20, 5, 20],
            backgroundColor: [
                'rgb(255, 99, 132)',
                'rgb(75, 192, 192)',
                'rgb(255, 205, 86)',
                'rgb(201, 203, 207)',
                'rgb(54, 162, 235)',
                'orange',
                'yellow',
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
        
    }
});
