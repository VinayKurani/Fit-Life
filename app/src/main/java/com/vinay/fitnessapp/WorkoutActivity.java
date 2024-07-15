package com.vinay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        Button butt1=(Button)findViewById(R.id.beginnerworkout);
        Button butt2=(Button)findViewById(R.id.intermediateworkout);
        Button butt3=(Button)findViewById(R.id.advancedworkout);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int1=new Intent(WorkoutActivity.this,BeginnerWorkoutActivity.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int2=new Intent(WorkoutActivity.this,IntermediateWorkoutActivity.class);
                startActivity(int2);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(WorkoutActivity.this, AdvancedWorkoutActivity.class);
                startActivity(int3);
            }
        });
    }
}