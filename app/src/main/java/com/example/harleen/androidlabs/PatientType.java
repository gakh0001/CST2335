package com.example.harleen.androidlabs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientType extends AppCompatActivity {
    private Button DoctorOff, Dentist,Optometric;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_type);

        DoctorOff = (Button) findViewById(R.id.off);

        Dentist = (Button) findViewById(R.id.Dentist);

        Optometric = (Button) findViewById(R.id.optometrist);

        DoctorOff.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent startAppIntent = new Intent(PatientType.this, PatientDetails.class);

                startActivity(startAppIntent);

            }

        });

        Dentist.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent startAppIntent = new Intent(PatientType.this, PatientDetails.class);

                startActivity(startAppIntent);

            }

        });

        Optometric.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent startAppIntent = new Intent(PatientType.this, PatientDetails.class);

                startActivity(startAppIntent);

            }

        });
    }
}
