package com.example.quizhistoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class telaFinal extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_final);
        TextView qtdAcertos;
        qtdAcertos = findViewById(R.id.tvAcertos);
        qtdAcertos.setText(Dados.contaAcertos());
        Button tentarNovamente = findViewById(R.id.btnRestart);
        tentarNovamente.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    if(view.getId() == R.id.btnRestart){
        Dados.populaMatriz();
        Dados.populaControle();
        Dados.contadorSwipe = 0;
        Pergunta.contador = 0;
        Intent intent = new Intent(this , MainActivity.class);
        startActivity(intent);
    }
    }
}
