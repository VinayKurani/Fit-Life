package com.vinay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class IntermediateWorkoutScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_workout_screen);

        Intent intent=getIntent();
        String number=intent.getStringExtra("Value");

        int intNumber=Integer.parseInt(number);

        Log.i("MESSAGE",number);

        switch(intNumber)
        {
            case 1:
                setContentView(R.layout.activity_squat_jumps);
                break;
            case 2:
                setContentView(R.layout.activity_decline_push_ups);
                break;
            case 3:
                setContentView(R.layout.activity_russian_twists);
                break;
            case 4:
                setContentView(R.layout.activity_lunge_jumps);
                break;
            case 5:
                setContentView(R.layout.activity_bicep_curls);
                break;
            case 6:
                setContentView(R.layout.activity_curtsy_lunges);
                break;
            case 7:
                setContentView(R.layout.activity_tricep_dips);
                break;
            case 8:
                setContentView(R.layout.activity_squatwithoverheadpress);
                break;

        }
    }
}