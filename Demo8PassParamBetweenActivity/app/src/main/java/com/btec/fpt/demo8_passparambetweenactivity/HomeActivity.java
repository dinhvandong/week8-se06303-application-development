package com.btec.fpt.demo8_passparambetweenactivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
    private TextView emailTextView;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        emailTextView = findViewById(R.id.emailTextView);


        // Retrieve email from SharedPreferences
        sharedPreferences = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE);
        String userEmail = sharedPreferences.getString("USER_EMAIL", "No Email Found");

        // Display email
        emailTextView.setText("Welcome, " + userEmail);
        // Get email from intent
//        Intent intent = getIntent();
//        String userEmail = intent.getStringExtra("USER_EMAIL");

        // Display email
        emailTextView.setText("Welcome, " + userEmail);
    }

}