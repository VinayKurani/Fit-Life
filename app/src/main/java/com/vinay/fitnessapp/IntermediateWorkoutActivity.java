package com.vinay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class IntermediateWorkoutActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_workout);

        newArray=new int[]{
                R.id.squatjumps,R.id.declinepushups,R.id.russiantwists,R.id.lungejumps,R.id.bicepcurls,R.id.curtsylunges,R.id.tricepdips,R.id.squatwithoverheadpress
        };
    }

    public void ImageButtonClicked(View view)
    {
        for(int i=0;i<newArray.length;i++)
        {
            if(view.getId()==newArray[i]) {
                int value = i + 1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(IntermediateWorkoutActivity.this, IntermediateWorkoutScreenActivity.class);
                intent.putExtra("Value", String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}