package com.example.youtuberandomduo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView input = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        String messageReceived = intent.getStringExtra(MainActivity.Extra_Message);
        input.setText("Hello, " + messageReceived+" Dont forget to like and subscribe! g ");

    }
}
