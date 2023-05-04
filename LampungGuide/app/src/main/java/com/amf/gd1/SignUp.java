package com.amf.gd1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    TextView Masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Masuk = findViewById(R.id.signinText);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("auvarmf") && password.getText().toString().equals("12345")) {
                    Toast.makeText(SignUp.this, "Sign Up Successful!", Toast.LENGTH_SHORT).show();

                    // Intent ke MainMenu
                    Intent intent = new Intent(SignUp.this, MainMenu.class);
                    startActivity(intent);
                    // Tutup activity saat ini
                    finish();
                } else {
                    Toast.makeText(SignUp.this, "Gagal Medaftar", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set click listener for Masuk
        Masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the next activity
                Intent intent = new Intent(SignUp.this, LoginMember.class);
                startActivity(intent);
            }
        });
    }
}