package com.example.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceivedMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        TextView tvMessage = findViewById(R.id.tvMessage);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        tvMessage.setText(message);
    }
}