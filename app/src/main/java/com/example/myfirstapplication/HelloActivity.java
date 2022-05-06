package com.example.myfirstapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HelloActivity extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        String s = getIntent().getStringExtra("valeur");
        // globally
        tv = findViewById(R.id.test)    ;
        tv.setText(s);
    }
}
