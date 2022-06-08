package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private ImageView imgg;
    private EditText edt;






    @Override
    public void onBackPressed() {
        //enlever le fait d'appeler le super
    }

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

        this.btn2=findViewById(R.id.btn_deux);//R est une classe générer automatiquement qui recupère tout ce qui est dans le file res
        this.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code executer lors du click
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Question?")
                    .setTitle(getResources().getString(R.string.popup_title))
                    .setMessage(getResources().getString(R.string.popup_message))
                    .setCancelable(false)
                    .setPositiveButton(getResources().getString(R.string.popup_btn_oui), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();

                        }
                    })
                    .setNegativeButton(getResources().getString(R.string.popup_btn_non), new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    })
                    .show();

            }
        });

        this.imgg=(ImageView) findViewById(R.id.imgg);
        imgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent en = new Intent(MainActivity.this, ImageActivity.class);
                startActivity(en);

            }
        });


        this.btn3=findViewById(R.id.btn_trois);
        this.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //un fichier xml et une classe java
                //code executer lors du click

                    String contenu = edt.getText().toString();
                    //le contenu qui sera taper
                    if( contenu != null && contenu.length()>1){

                    Intent in = new Intent(MainActivity.this, HelloActivity.class);
                    in.putExtra("valeur",contenu);
                    startActivity(in);
                    }else {
                        //message cible
                        edt.setError("Saisie obligatoire");
                    }


               // Toast.makeText(MainActivity.this,"Helloww", Toast.LENGTH_LONG).show();


            }
        });

        this.edt =findViewById(R.id.edt_saisie);

    }

}