package com.example.travelassistant.routings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.travelassistant.MasstransitRoutingActivity;
import com.example.travelassistant.R;

public class RoutinNavigationActivity extends AppCompatActivity {

    String request;
    RelativeLayout one, two,threee, fore, five;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routin_navigation);

        one = findViewById(R.id.moscowcontainer);
        two = findViewById(R.id.moscowcontainer2);
        threee = findViewById(R.id.moscowcontainer3);
        fore = findViewById(R.id.moscowcontainer4);
        five = findViewById(R.id.moscowcontainer5);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoutinNavigationActivity.this, MasstransitRoutingActivity.class);
                startActivity(intent);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoutinNavigationActivity.this, MasstransitRoutingActivity.class);
                startActivity(intent);
            }
        });

        threee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoutinNavigationActivity.this, MasstransitRoutingActivity.class);
                startActivity(intent);
            }
        });

        fore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoutinNavigationActivity.this, MasstransitRoutingActivity.class);
                startActivity(intent);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RoutinNavigationActivity.this, MasstransitRoutingActivity.class);
                startActivity(intent);
            }
        });





    }
}