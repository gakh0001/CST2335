package com.example.harleen.androidlabs;
import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

public class PatientIntakeForm extends Activity {
    private Button startAppBtn, aboutBtn;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_patient_intake_form);

        startAppBtn = (Button) findViewById(R.id.startAppBtn);

        aboutBtn = (Button) findViewById(R.id.aboutBtn);

        startAppBtn.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent startAppIntent = new Intent(PatientIntakeForm.this, PatientType.class);

                startActivity(startAppIntent);

            }

        });

        aboutBtn.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                // Start the about page

            }

        });

    }

}