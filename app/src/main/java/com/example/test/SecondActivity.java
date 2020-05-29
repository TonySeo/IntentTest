package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = new Intent(this.getIntent());
        String s = i.getStringExtra("text");
        TextView tv = (TextView)findViewById(R.id.textview);
        tv.setText(s);
    }
}
