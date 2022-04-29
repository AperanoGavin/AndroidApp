package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btn1=findViewById(R.id.btn_un);//R est une classe générer automatiquement qui recupère tout ce qui est dans le file res
        this.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //code executer lors du click
                Toast.makeText(MainActivity.this,"Hello world", Toast.LENGTH_LONG).show();
            }
        });

    }

}