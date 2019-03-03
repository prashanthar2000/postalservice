package com.example.prashanth.postalservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pickup_point extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup_point);
        final Button next = (Button) findViewById(R.id.next);
        final Button maps = (Button) findViewById(R.id.maps);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), drop_point.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "just one more things :) ", Toast.LENGTH_LONG).show();
            }
        });
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), map.class);
                startActivity(i);

            }
        });
    }
}
