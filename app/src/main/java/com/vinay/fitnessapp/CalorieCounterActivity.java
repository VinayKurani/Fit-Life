package com.vinay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalorieCounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_counter);

        Button butt1=(Button)findViewById(R.id.caloriechart);
        Button butt2=(Button)findViewById(R.id.caloriecalculator);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int1=new Intent(CalorieCounterActivity.this,CalorieChartActivity.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int2=new Intent(CalorieCounterActivity.this,CalorieCalculatorActivity.class);
                startActivity(int2);
            }
        });
    }
}