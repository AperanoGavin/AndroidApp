package com.example.myfirstapplication;

import android.media.Image;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ImageActivity extends AppCompatActivity {

    private Image img;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        //Image i = getIntent().getStringExtra("valeur");
        // globally
        //img = findViewById(R.id.test)    ;
        //img.setText(s);
    }
}
