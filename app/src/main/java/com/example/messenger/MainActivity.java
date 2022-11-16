package com.example.messenger;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSendMessage = findViewById(R.id.btSendMessage);
        EditText etMessage = findViewById(R.id.etMessage);

        btSendMessage.setOnClickListener(view -> {
            String message = etMessage.getText().toString();
            launchNextScreen(message);
        });
    }

    private void launchNextScreen(String message) {
        Intent intent = new Intent(this, ReceivedMessageActivity.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}