package com.example.foodorderingapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    public static final String TAG = "TAG";
    EditText mUsername,mEmail, mPassword,mpPhone;
    Button mRegistrerBtn;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mUsername=findViewById(R.id.fullname);
        mEmail=findViewById(R.id.email);
        mPassword=findViewById(R.id.password);
        mpPhone=findViewById(R.id.phone);
        mRegistrerBtn=findViewById(R.id.registerBtn);
        progressBar=findViewById(R.id.progressBar);


        mRegistrerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String email=mEmail.getText().toString().trim();
                final String pass=mPassword.getText().toString().trim();
                final String username=mUsername.getText().toString();
                final String phone=mpPhone.getText().toString();

                if(TextUtils.isEmpty(email)){
                    mEmail.setError("Email is Required");
                    return;
                }
                if (TextUtils.isEmpty(pass)
                ){
                    mPassword.setError("Password is Required");
                    return;
                }
                if (pass.length()<6){

                    mPassword.setError("Password must be >=6 Character");
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);

                Intent intent=new Intent(SignUp.this,Login.class);
                intent.putExtra("email",email);
                intent.putExtra("pass",pass);
                startActivity(intent);
            }
        });
    }


}