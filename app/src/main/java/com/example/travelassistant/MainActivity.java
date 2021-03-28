package com.example.travelassistant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.travelassistant.downloadServices.DownloadAudio;
import com.example.travelassistant.routings.RoutinNavigationActivity;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {

    private CardView pedestrian;
    private CardView baisicle;
    private CardView cargo;
    DownloadAudio downloadAudio;
    private String mJSONURLString = "https://myrik8333.github.io/moscow.json";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        downloadAudio = new DownloadAudio(mJSONURLString,  mJSONURLString, this.getApplicationContext(),false);
        downloadAudio.startDownloading(mJSONURLString);
        Log.d("TAG", "downloa");
        pedestrian = findViewById(R.id.pedestrian);
        baisicle = findViewById(R.id.baisicalgo);
        cargo = findViewById(R.id.cargo);

        pedestrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPed = new Intent(MainActivity.this, RoutinNavigationActivity.class);
                //intentPed.putExtra("pedestrian", "pedestrian");
                startActivity(intentPed);

            }
        });

        baisicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPed = new Intent(MainActivity.this, RoutinNavigationActivity.class);
                //intentPed.putExtra("baisicle", "baisicle");
                startActivity(intentPed);

            }
        });

        cargo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPed = new Intent(MainActivity.this, RoutinNavigationActivity.class);
                //intentPed.putExtra("cargo", "cargo");
                startActivity(intentPed);
            }
        });


    }
}