package com.example.loginapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set welcome message
        TextView welcomeMessage = findViewById(R.id.tvWelcomeMessage);
        welcomeMessage.setText("Welcome to the Main Activity!");
    }
}