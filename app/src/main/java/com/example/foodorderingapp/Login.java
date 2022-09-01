package com.example.foodorderingapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {

    TextInputEditText emailT;
    TextInputEditText passT;
    String email="food@gmail.com",pass="food";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailT=findViewById(R.id.email);
        passT=findViewById(R.id.pass);
    }



    public void submit(View view) {
                  if(!emailT.getText().toString().equals("")&&!passT.getText().toString().equals("")){
            if(email.equals(emailT.getText().toString())&&pass.equals(passT.getText().toString())){
                Snackbar.make(view, "Login Success", Snackbar.LENGTH_LONG)
                        .setAction("CLOSE", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        })
                        .setActionTextColor(getResources().getColor(android.R.color.holo_red_light ))
                        .show();

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        Intent intent =new Intent(Login.this,HomeActivity.class);
                        startActivity(intent);

                    }
                }, 1000);

            }
            else{
                Snackbar.make(view, "Email Id and Password dose Not match..", Snackbar.LENGTH_LONG)
                        .setAction("CLOSE", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        })
                        .setActionTextColor(getResources().getColor(android.R.color.holo_red_light ))
                        .show();
            }

        }else{
            Snackbar.make(view, "Fields are Empty", Snackbar.LENGTH_LONG)
                    .setAction("CLOSE", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    })
                    .setActionTextColor(getResources().getColor(android.R.color.holo_red_light ))
                    .show();

        }

    }

    public void Singin(View view) {
        Intent intent = new Intent(Login.this,SignUp.class);
        startActivity(intent);
    }
}