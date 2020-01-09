package com.example.youtuberandomduo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String Extra_Message = "com.example.youtuberandomduo.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToOtherActivity(View view) {

        Intent intent = new Intent(this,SecondActivity.class);
        EditText input = (EditText) findViewById(R.id.textView2);
        String name = input.getText().toString();
        intent.putExtra(Extra_Message,name);
        startActivity(intent);
    }
}
