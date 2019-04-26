package com.example.cassiamshigenaga.aplicativosenac;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String CURSO = "com.example.aplicativosenac.CURSO";
    public String tituloActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoTecnico (View view){
        tituloActivity = "Técnico";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(CURSO, tituloActivity);
        startActivity(intent);
    }

    public void botaoSuperior (View view){
        tituloActivity = "Superior";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(CURSO, tituloActivity);
        startActivity(intent);
    }
}
