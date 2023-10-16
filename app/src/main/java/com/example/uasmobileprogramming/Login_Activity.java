package com.example.uasmobileprogramming;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login_Activity extends AppCompatActivity {
    private EditText Username, Password;
    private Button BtnLogin;

    // Shared Preferences
    private SharedPreferences preferences;

    // Temp Data
    private String username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        InitiateViews();

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check();
            }
        });
    }

    private void InitiateViews(){
        Username = findViewById(R.id.UsernameLgn);
        Password = findViewById(R.id.PasswordLgn);
        BtnLogin = findViewById(R.id.BtnLogin);

        preferences = getSharedPreferences("Data", MODE_PRIVATE);
    }

    private void Check(){
        username = Username.getText().toString();
        password = Password.getText().toString();

        if (username.isEmpty() || password.isEmpty()){
            Toast.makeText(getApplicationContext(),"Please fils all form",Toast.LENGTH_LONG).show();
        } else {
            String checkusername, checkpassword;
            checkusername = preferences.getString("username", "none");
            checkpassword = preferences.getString("password", "none");

            if (username.equals(checkusername) && password.equals(checkpassword)){
                Intent intent = new Intent(getApplicationContext(),Main_Activity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(getApplicationContext(),"Invalid Account", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void onBackPressed() {

    }
}