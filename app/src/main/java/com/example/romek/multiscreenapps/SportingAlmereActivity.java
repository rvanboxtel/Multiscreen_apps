package com.example.romek.multiscreenapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SportingAlmereActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sporting);
        //Finds the button for sporting
        final TextView backToMenu = (TextView)findViewById(R.id.back);

        //Makes onclick listenner
        backToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create new intent
                Intent backToMain = new Intent(SportingAlmereActivity.this, MainActivity.class);

                //starts the new activity
                startActivity(backToMain);
            }
        });
    }
}
