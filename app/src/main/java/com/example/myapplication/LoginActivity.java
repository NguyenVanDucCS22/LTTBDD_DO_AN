package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    Button btnSighup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnLogin= findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(view -> {
            Intent myIntend= new Intent(LoginActivity.this,MainActivity.class);
            startActivity(myIntend);
        });
        btnSighup= findViewById(R.id.btnSighup);
        btnSighup.setOnClickListener(view -> {
            Intent myIntend= new Intent(LoginActivity.this, SighupActivity.class);
            startActivity(myIntend);
        });
    }

}