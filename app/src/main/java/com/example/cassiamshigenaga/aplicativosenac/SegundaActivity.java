package com.example.cassiamshigenaga.aplicativosenac;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.cassiamshigenaga.aplicativosenac.Escola.NovoCurso;

import java.util.ArrayList;


public class SegundaActivity extends AppCompatActivity {

    public ArrayList<NovoCurso> cursos = new ArrayList<>();
    public LinearLayout layoutLinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String curso = intent.getStringExtra(MainActivity.CURSO);

        TextView textViewCurso = findViewById(R.id.tvCursos);
        textViewCurso.setText(curso);

        if(curso.equals("Técnico")){
        cursos.add (new NovoCurso("Técnico em informática", "1.200 horas", "Técnico", "15"));
        cursos.add (new NovoCurso("Segurança do trabalho", "1.100 horas", "Técnico", "15"));

        }

        else if (curso.equals("Superior")){
            cursos.add (new NovoCurso("Desenvolvimento de software", "4 anos", "Superior", "20"));
            cursos.add (new NovoCurso("Ciência da computação", "4 anos", "Superior", "15"));
        }

        listaCursos(cursos);

    }

    public void listaCursos (ArrayList<NovoCurso> lista) {

        layoutLinear = findViewById(R.id.lVertical);

        for (int i = 0; i < lista.size(); i++) {
            TextView textViewCurso = new TextView(this);
            TextView textViewDuracao = new TextView(this);
            TextView textViewTipo = new TextView(this);
            TextView textViewVagas = new TextView(this);

            textViewCurso.setText(lista.get(i).getCurso());
            textViewDuracao.setText(lista.get(i).getDuracao());
            textViewTipo.setText(lista.get(i).getTipo());
            textViewVagas.setText(lista.get(i).getVagas());


            layoutLinear.addView(textViewCurso);
            layoutLinear.addView(textViewDuracao);
            layoutLinear.addView(textViewTipo);
            layoutLinear.addView(textViewVagas);

        }
    }
}
