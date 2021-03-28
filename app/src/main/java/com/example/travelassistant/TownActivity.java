package com.example.travelassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class TownActivity extends AppCompatActivity {


    RelativeLayout msk, vlg, yfa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_town);

        msk = findViewById(R.id.moscowcontainer);
        vlg = findViewById(R.id.vlgcontainer);
        yfa = findViewById(R.id.yfacontainer);

        msk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TownActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        vlg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TownActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        yfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TownActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}