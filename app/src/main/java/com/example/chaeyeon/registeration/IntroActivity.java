package com.example.chaeyeon.registeration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ChaeYeon on 2017-05-05.
 */

public class IntroActivity extends AppCompatActivity {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_intro);

            Button boardButton = (Button) findViewById(R.id.boardButton);
            boardButton.setOnClickListener(new Button.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(IntroActivity.this, BoardActivity.class);
                    startActivity(intent);
                }
            });


            Button foodButton = (Button) findViewById(R.id.foodButton);
            foodButton.setOnClickListener(new Button.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(IntroActivity.this, FoodSelectActivity.class);
                    startActivity(intent);

                }
            });
            Button mapButton = (Button) findViewById(R.id.mapButton);
            mapButton.setOnClickListener(new Button.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(IntroActivity.this, MapActivity.class);
                    startActivity(intent);
                }
            });
        }
    }



