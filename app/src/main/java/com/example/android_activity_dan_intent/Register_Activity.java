package com.example.android_activity_dan_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
Nama: Muhammad Farhan R
NIM : 10119023
Kelas : IF-1
tanggal : 23/04/2022
 */

public class Register_Activity extends AppCompatActivity {

    private Button regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().hide();

        regis = findViewById(R.id.regis);

        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register_Activity.this, Login_Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}