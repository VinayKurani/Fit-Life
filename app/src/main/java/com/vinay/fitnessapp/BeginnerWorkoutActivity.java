package com.vinay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.lang.reflect.Array;

public class BeginnerWorkoutActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_workout);

        newArray =new int[]{
                R.id.squats,R.id.pushups,R.id.situps,R.id.forwardlunges,R.id.bicepcurls,R.id.laterallunges,R.id.tricepdips,R.id.reverselunges
        };
    }

    public void ImageButtonClicked(View view)
    {
        for(int i=0;i<newArray.length;i++)
        {
            if(view.getId()==newArray[i]) {
                int value = i + 1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(BeginnerWorkoutActivity.this, BeginnerWorkoutScreenActivity.class);
                intent.putExtra("Value", String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}