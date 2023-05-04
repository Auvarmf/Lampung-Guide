package com.amf.gd1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPilih extends AppCompatActivity {

    private Button loginButton;
    private Button daftarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_pilih);

        loginButton = findViewById(R.id.btnLogin);
        daftarButton = findViewById(R.id.btnDaftar);

        // Set click listener for Login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the next activity
                Intent intent = new Intent(LoginPilih.this, LoginMember.class);
                startActivity(intent);
            }
        });

        // Set click listener for Daftar
        daftarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the next activity
                Intent intent = new Intent(LoginPilih.this, SignUp.class);
                startActivity(intent);
            }
        });
    }
}