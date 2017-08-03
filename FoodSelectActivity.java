package com.example.chaeyeon.registeration;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by LeeHyeokJin on 2017-07-09.
 */

public class FoodSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodselect);

        Button rest1_button = (Button)findViewById(R.id.restaurant_1);
        Button rest2_button = (Button)findViewById(R.id.restaurant_2);
        Button rest3_button = (Button)findViewById(R.id.restaurant_3);




            rest1_button.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(FoodSelectActivity.this, FoodActivity.class);
                    intent.putExtra("rest_name",1);
                    startActivity(intent);

                }
            });

            rest2_button.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(FoodSelectActivity.this, FoodActivity.class);
                    intent.putExtra("rest_name",2);
                    startActivity(intent);

                }
            });

            rest3_button.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(FoodSelectActivity.this, FoodActivity.class);
                    intent.putExtra("rest_name",3);
                    startActivity(intent);

                }
            });

    }
}
