package com.vinay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class AdvancedYogaScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_yoga_screen);

        Intent intent=getIntent();
        String number=intent.getStringExtra("Value");

        int intNumber=Integer.parseInt(number);

        Log.i("MESSAGE",number);

        switch(intNumber)
        {
            case 1:
                setContentView(R.layout.activity_king_pigeon_pose);
                break;
            case 2:
                setContentView(R.layout.activity_dove_pose);
                break;
            case 3:
                setContentView(R.layout.activity_peacock_pose);
                break;
            case 4:
                setContentView(R.layout.activity_lordofthedance);
                break;
            case 5:
                setContentView(R.layout.activity_headstand);
                break;
            case 6:
                setContentView(R.layout.activity_headstand_lotus);
                break;
            case 7:
                setContentView(R.layout.activity_firefly);
                break;
            case 8:
                setContentView(R.layout.activity_corpse_pose);
                break;

        }
    }
}