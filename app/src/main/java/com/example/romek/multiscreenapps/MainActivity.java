package com.example.romek.multiscreenapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //sets main intent
        setContentView(R.layout.activity_main);

        //Finds the button for sporting
        final TextView sporting = (TextView)findViewById(R.id.firstlocation);

        //Makes onclick listenner
        sporting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create new intent
                Intent sportingIntent = new Intent(MainActivity.this, SportingAlmereActivity.class);

                //starts the new activity
                startActivity(sportingIntent);
            }
        });
    }
}


