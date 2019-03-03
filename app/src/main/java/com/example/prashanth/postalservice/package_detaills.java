package com.example.prashanth.postalservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class package_detaills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package_detaills);
        final Button next1 = (Button) findViewById(R.id.next1);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), pickup_point.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), "just few more things :) ", Toast.LENGTH_LONG).show();

            }
        });
    }
}