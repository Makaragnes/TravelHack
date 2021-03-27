package com.example.travelassistant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView pedestrian;
    private CardView baisicle;
    private CardView cargo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pedestrian = findViewById(R.id.pedestrian);
        baisicle = findViewById(R.id.baisicalgo);
        cargo = findViewById(R.id.cargo);

        pedestrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPed = new Intent(MainActivity.this, RoutingActivity.class);
                startActivity(intentPed);
            }
        });

        baisicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPed = new Intent(MainActivity.this, RoutingActivity.class);
                startActivity(intentPed);

            }
        });

        cargo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPed = new Intent(MainActivity.this, RoutingActivity.class);
                startActivity(intentPed);

            }
        });


    }
}