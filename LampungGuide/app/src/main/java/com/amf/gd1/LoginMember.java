package com.amf.gd1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginMember extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    TextView Daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_member);

        Daftar = findViewById(R.id.signupText);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("auvarmf") && password.getText().toString().equals("12345")) {
                    Toast.makeText(LoginMember.this, "Login Successful!", Toast.LENGTH_SHORT).show();

                    // Intent ke MainMenu
                    Intent intent = new Intent(LoginMember.this, MainMenu.class);
                    startActivity(intent);
                    // Tutup activity saat ini
                    finish();
                } else {
                    Toast.makeText(LoginMember.this, "Gagal Masuk", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set click listener for Daftar
        Daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the next activity
                Intent intent = new Intent(LoginMember.this, SignUp.class);
                startActivity(intent);
            }
        });
    }
}