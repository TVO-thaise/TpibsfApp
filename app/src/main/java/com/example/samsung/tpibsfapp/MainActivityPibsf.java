package com.example.samsung.tpibsfapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityPibsf extends AppCompatActivity {

    private Button btnSite;
    private Button btnApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pibsf);

        btnSite = (Button) findViewById(R.id.btnSite);
        btnApp = (Button) findViewById(R.id.btnApp);

        btnSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aqui você implementa a ação do primeiro botão
                Uri uri = Uri.parse("http://pibsf.com.br/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aqui você implementa a ação do segundo botão
                Intent intent = new Intent(MainActivityPibsf.this, MainActivity2Menu.class);
                startActivity(intent);
            }
        });
    }
}
