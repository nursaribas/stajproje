package com.example.afyonvproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public View ekran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ekran = (View) findViewById(R.id.ekran);

        ekran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ekranIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity (ekranIntent);
            }
        });

    }





}