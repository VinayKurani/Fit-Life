package com.vinay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BeginnerWorkoutScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_workout_screen);

        Intent intent=getIntent();
        String number=intent.getStringExtra("Value");

        int intNumber=Integer.parseInt(number);

        Log.i("MESSAGE",number);

        switch(intNumber)
        {
            case 1:
                setContentView(R.layout.activity_squats);
                break;
            case 2:
                setContentView(R.layout.activity_push_ups);
                break;
            case 3:
                setContentView(R.layout.activity_sit_ups);
                break;
            case 4:
                setContentView(R.layout.activity_forward_lunges);
                break;
            case 5:
                setContentView(R.layout.activity_bicep_curls);
                break;
            case 6:
                setContentView(R.layout.activity_lateral_lunges);
                break;
            case 7:
                setContentView(R.layout.activity_tricep_dips);
                break;
            case 8:
                setContentView(R.layout.activity_reverse_lunges);
                break;

        }

    }
}
