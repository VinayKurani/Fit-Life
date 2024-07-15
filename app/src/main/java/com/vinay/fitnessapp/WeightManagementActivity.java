package com.vinay.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeightManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_management);

        Button butt1=(Button)findViewById(R.id.weightloss);
        Button butt2=(Button)findViewById(R.id.weightgain);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int1=new Intent(WeightManagementActivity.this,WeightLossActivity.class);
                startActivity(int1);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent int2=new Intent(WeightManagementActivity.this,WeightGainActivity.class);
                startActivity(int2);
            }
        });
    }
}