package com.example.samsung.tpibsfapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2Menu extends AppCompatActivity {

    private Button btnPib;
    private Button btnAtiv;
    private Button btnMusic;
    private Button btnCelula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_menu);

        btnPib = (Button) findViewById(R.id.btnPib);
        btnAtiv = (Button) findViewById(R.id.btnAtiv);
        btnMusic = (Button) findViewById(R.id.btnMusic);
        btnCelula = (Button) findViewById(R.id.btnCelula);

        btnPib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre uma nova tela com as descrições Pibsf
                Intent intent = new Intent(MainActivity2Menu.this, TelaPib.class);
                startActivity(intent);
            }
        });
        btnAtiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre uma nova tela com as descrições de Atividades
                Intent intent = new Intent(MainActivity2Menu.this, TelaAtiv.class);
                startActivity(intent);
            }
        });

        btnMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre uma nova tela com as descrições de Atividades
                Intent intent = new Intent(MainActivity2Menu.this, TelaMusic.class);
                startActivity(intent);
            }
        });

        btnCelula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre uma nova tela com as descrições de Atividades
                Intent intent = new Intent(MainActivity2Menu.this, TelaCelula.class);
                startActivity(intent);
            }
        });

    }
}
