package com.example.android_activity_dan_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    private Button btnLogin;
    private EditText username,password;
    private TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        setData();
        runIntent();

    }

    public void setData(){
        btnLogin = findViewById(R.id.btnLogin);
        username = findViewById(R.id.loginUsename);
        password = findViewById(R.id.loginPassword);
        register = findViewById(R.id.btnRegis);
    }

    public void runIntent(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().trim().equals("") &&
                        password.getText().toString().trim().equals("")) {
                    Toast.makeText(Login_Activity.this, "Please Enter Your Username And Password",
                            Toast.LENGTH_SHORT).show();
                }else if (username.getText().toString().trim().equals("")) {
                    Toast.makeText(Login_Activity.this, "Please Enter Your Username",
                            Toast.LENGTH_SHORT).show();
                }else if (password.getText().toString().trim().equals("")) {
                    Toast.makeText(Login_Activity.this, "Please Enter Your Password",
                            Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(Login_Activity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register.setTextColor(Color.parseColor("#417FCC"));
                Intent intent = new Intent(Login_Activity.this, Register_Activity.class);
                startActivity(intent);

            }
        });
    }
}