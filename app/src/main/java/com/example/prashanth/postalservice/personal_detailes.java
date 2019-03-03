package com.example.prashanth.postalservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class personal_detailes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_detailes);
        final Button signin2 = (Button) findViewById(R.id.signin2);

        signin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),package_detaills.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"you have successfully logged in ",Toast.LENGTH_LONG).show();
            }

            /*
            @Override
            public void onClick(View v) {
                signin2Clicked(v);
            }

            private void signin2Clicked(View v) {
                SimpleAlertDialog.displayWithOK(this, "secondButton clicked via Java handler in onCreate");
            }
            */


        });
    }
}



