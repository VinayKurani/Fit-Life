package com.vinay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YogaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

        Button butt1=(Button)findViewById(R.id.beginneryoga);
        Button butt2=(Button)findViewById(R.id.intermediateyoga);
        Button butt3=(Button)findViewById(R.id.advancedyoga);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int1=new Intent(YogaActivity.this,BeginnerYogaActivity.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int2=new Intent(YogaActivity.this,IntermediateYogaActivity.class);
                startActivity(int2);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(YogaActivity.this, AdvancedYogaActivity.class);
                startActivity(int3);
            }
        });


    }
}