package com.vinay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class IntermediateYogaScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate_yoga_screen);

        Intent intent=getIntent();
        String number=intent.getStringExtra("Value");

        int intNumber=Integer.parseInt(number);

        Log.i("MESSAGE",number);

        switch(intNumber)
        {
            case 1:
                setContentView(R.layout.activity_cat_cow);
                break;
            case 2:
                setContentView(R.layout.activity_downward_dog);
                break;
            case 3:
                setContentView(R.layout.activity_warrior1);
                break;
            case 4:
                setContentView(R.layout.activity_bridge_pose);
                break;
            case 5:
                setContentView(R.layout.activity_garland_pose);
                break;
            case 6:
                setContentView(R.layout.activity_bow_pose);
                break;
            case 7:
                setContentView(R.layout.activity_boat_pose);
                break;
            case 8:
                setContentView(R.layout.activity_corpse_pose);
                break;

        }
    }
}