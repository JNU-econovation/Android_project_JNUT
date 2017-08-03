package com.example.chaeyeon.registeration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ChaeYeon on 2017-05-05.
 */

public class IntroActivity extends AppCompatActivity {

    long now = System.currentTimeMillis();
    Date date = new Date(now);
    SimpleDateFormat sdfNow = new SimpleDateFormat("yyyy.MM.dd  |  HH:mm:ss");
    String formatDate = sdfNow.format(date);
    TextView time;
    FirebaseAuth fAuth = FirebaseAuth.getInstance();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        time = (TextView)findViewById(R.id.time);
        time.setText("접속시간   "+ formatDate);

        Button boardButton = (Button) findViewById(R.id.boardButton);
        boardButton.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntroActivity.this, MainActivity.class);
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
        Button logoutButton = (Button) findViewById(R.id.logoutButton);
        logoutButton.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                fAuth.signOut();
                Intent intent = new Intent(IntroActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}



