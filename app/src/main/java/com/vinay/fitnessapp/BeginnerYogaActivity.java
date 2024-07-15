package com.vinay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class BeginnerYogaActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_yoga);

        newArray =new int[]{
                R.id.childspose,R.id.happybaby,R.id.catcow,R.id.cobrapose,R.id.chairpose,R.id.caterpillarpose,R.id.downwarddog,R.id.corpsepose
        };
    }

    public void ImageButtonClicked(View view)
    {
        for(int i=0;i<newArray.length;i++)
        {
            if(view.getId()==newArray[i]) {
                int value = i + 1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(BeginnerYogaActivity.this, BeginnerYogaScreenActivity.class);
                intent.putExtra("Value", String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}