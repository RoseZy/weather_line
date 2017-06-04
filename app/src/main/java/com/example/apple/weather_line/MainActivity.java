package com.example.apple.weather_line;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public List<Float> yValueMax=null;
    public List<Float> yValueMin=null;
    WeatherLineChart weatherLineChart=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        yValueMax=new ArrayList<>();
        yValueMin=new ArrayList<>();
        weatherLineChart= (WeatherLineChart) findViewById(R.id.myLineChart);

        yValueMax.add(14f);
        yValueMax.add(15f);
        yValueMax.add(16f);
        yValueMax.add(17f);
        yValueMax.add(9f);
        yValueMax.add(9f);

        yValueMin.add(7f);
        yValueMin.add(5f);
        yValueMin.add(9f);
        yValueMin.add(10f);
        yValueMin.add(3f);
        yValueMin.add(2f);


        weatherLineChart.setYValueMax(yValueMax);
        weatherLineChart.setYValueMin(yValueMin);
        weatherLineChart.invalidate();
    }
}
