$(document).ready(function(){
    var options = {
        title: {
            text: 'Temperatur i Trondheim',
            x: -20 //center
        },
        subtitle: {
            text: 'Kilde: yr.no',
            x: -20
        },
        xAxis: {
            categories: ['Aug', 'Sep', 'Okt', 'Nov', 'Des', 'Jan',
                'Feb', 'Mar', 'Apr', 'Mai', 'Jun', 'Jul']
        },
        yAxis: {
            title: {
                text: 'Temperatur (°C)'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        tooltip: {
            valueSuffix: '°C'
        },
        legend: {
            layout: 'vertical',
            align: 'right',
            verticalAlign: 'middle',
            borderWidth: 0
        },
        series: [{}]
    };

    $.getJSON('rest/temperatures', function(data) {
        options.series = data;
        $('#container').highcharts(options);
    });
});