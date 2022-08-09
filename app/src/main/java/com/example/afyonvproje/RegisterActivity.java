package com.example.afyonvproje;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private ImageView travel;
    private TextView KaydolYazısı;
    private EditText adsoyad;
    private EditText email;
    private EditText telefon;
    private EditText password;
    public Button kaydol;

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        travel = (ImageView) findViewById(R.id.travel);
        KaydolYazısı= (TextView) findViewById(R.id.Kaydol);
        adsoyad = (EditText) findViewById(R.id.adsoyad);
        email = (EditText) findViewById(R.id.emailText);
        telefon = (EditText) findViewById(R.id.telefon);
        password = (EditText) findViewById(R.id.password);
        kaydol = (Button) findViewById(R.id.kaydol);


        kaydol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity (registerIntent);
            }
        });

    }


}
