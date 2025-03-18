package com.btec.fpt.demo8_passparambetweenactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {
    private TextView emailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        emailTextView = findViewById(R.id.emailTextView);

        // Get email from intent
        Intent intent = getIntent();
        String userEmail = intent.getStringExtra("USER_EMAIL");

        // Display email
        emailTextView.setText("Welcome, " + userEmail);
    }

}