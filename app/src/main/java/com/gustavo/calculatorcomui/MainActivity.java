package com.gustavo.calculatorcomui;

import android.content.Intent;
import android.service.autofill.OnClickAction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Buttons

    Button btnLaranja, btnAzul, btnVerde, btnRoxo, btnAmarelo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);

        getSupportActionBar().hide();

        btnLaranja = (Button) findViewById(R.id.btnSimpleLaranja);
        btnLaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NormalLaranja.class);
                startActivity(intent);
            }
        });

        btnAzul = (Button) findViewById(R.id.btnSimpleAzul);
        btnAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SimpleAzul.class);
                startActivity(intent);
            }
        });

        btnVerde = (Button) findViewById(R.id.btnLiteVerde);
        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LiteVerde.class);
                startActivity(intent);
            }
        });

        btnRoxo = (Button) findViewById(R.id.btnLiteRoxo);
        btnRoxo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Constraint_layout.class);
                startActivity(intent);
            }
        });

        btnAmarelo = (Button) findViewById(R.id.btnRelativeAmarelo);
        btnAmarelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Relative_layout.class);
                startActivity(intent);
            }
        });
    }
}