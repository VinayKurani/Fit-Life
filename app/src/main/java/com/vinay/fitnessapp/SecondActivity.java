package com.vinay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button butt1=(Button)findViewById(R.id.yoga);
        Button butt2=(Button)findViewById(R.id.workout);
        Button butt3=(Button)findViewById(R.id.caloriecounter);
        Button butt4=(Button)findViewById(R.id.weightmanagement);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int1=new Intent(SecondActivity.this,YogaActivity.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int2=new Intent(SecondActivity.this,WorkoutActivity.class);
                startActivity(int2);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int3=new Intent(SecondActivity.this,CalorieCounterActivity.class);
                startActivity(int3);
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int4=new Intent(SecondActivity.this,WeightManagementActivity.class);
                startActivity(int4);
            }
        });
    }
}

