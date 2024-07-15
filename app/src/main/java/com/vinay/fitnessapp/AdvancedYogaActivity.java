package com.vinay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AdvancedYogaActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_yoga);


        newArray=new int[]{
                R.id.kingpigeonpose,R.id.dovepose,R.id.peacockpose,R.id.lordofthedance,R.id.headstand,R.id.headstandlotus,R.id.firefly,R.id.corpsepose
        };
    }

    public void ImageButtonClicked(View view)
    {
        for(int i=0;i<newArray.length;i++)
        {
            if(view.getId()==newArray[i]) {
                int value = i + 1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(AdvancedYogaActivity.this, AdvancedYogaScreenActivity.class);
                intent.putExtra("Value", String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}