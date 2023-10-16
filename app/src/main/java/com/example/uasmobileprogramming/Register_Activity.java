package com.example.uasmobileprogramming;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register_Activity extends AppCompatActivity {
    private EditText username,email,phonenumber, password;
    private SharedPreferences preferences;
    private Button BtnRegis;

    // Temp Data
    private String Username,Email,PhoneNumber, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        InitiateViews();

        BtnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
            }
        });
    }

    private void InitiateViews(){
        username = findViewById(R.id.UsernameRegister);
        email = findViewById(R.id.EmailRegister);
        phonenumber = findViewById(R.id.PhonenumberRegister);
        password = findViewById(R.id.PasswordRegister);
        BtnRegis = findViewById(R.id.BtnRegister);

        preferences = getSharedPreferences("Data",MODE_PRIVATE);
    }

    private void check(){
        Username = username.getText().toString();
        Email = email.getText().toString();
        PhoneNumber = phonenumber.getText().toString();
        Password = password.getText().toString();

        if (Username.isEmpty() || Email.isEmpty() || PhoneNumber.isEmpty() || PhoneNumber.isEmpty()){
            Toast.makeText(getApplicationContext(),"Please fils all forms", Toast.LENGTH_LONG).show();
        } else {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("username", Username);
            editor.putString("email", Email);
            editor.putString("phonenumber", PhoneNumber);
            editor.putString("password", Password);
            editor.apply();

            Intent intent = new Intent(getApplicationContext(),Main_Activity.class);
            startActivity(intent);
            finish();
        }
    }
}