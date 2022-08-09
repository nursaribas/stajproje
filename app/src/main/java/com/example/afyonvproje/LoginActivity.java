package com.example.afyonvproje;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity  {

    public View ekran;
    public ImageView travel;
    public TextView LogınYazısı;
    public EditText email;
    public EditText Parola;
    public TextView emailText;
    public TextView passwordText;
    public Button kaydol;
    public TextView yada;
    public Button giris;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        travel = (ImageView) findViewById(R.id.travel);
        ekran = (View) findViewById(R.id.ekran);
        LogınYazısı = (TextView) findViewById(R.id.LogınYazısı);
        email = (EditText) findViewById(R.id.email);
        Parola = (EditText) findViewById(R.id.Parola);
        emailText = (TextView) findViewById(R.id.emailText);
        passwordText = (TextView) findViewById(R.id.password);
        kaydol = (Button) findViewById(R.id.kaydol);
        yada = (TextView) findViewById(R.id.yada);
        giris = (Button) findViewById(R.id.kaydol);





        kaydol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity (registerIntent);
            }
        });

    }







}
