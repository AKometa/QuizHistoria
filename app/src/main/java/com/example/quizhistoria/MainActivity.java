package com.example.quizhistoria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout tela;
    private TextView pergunta;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tela = findViewById(R.id.telaToda);
        pergunta = findViewById(R.id.tvPergunta);
        final Intent intent = new Intent(this, telaFinal.class);
        Dados.populaMatriz();
        Dados.populaControle();
        pergunta.setText(Pergunta.retornaArray().get(Pergunta.contador));


        tela.setOnTouchListener(new OnSwipeTouchListener(this) {

            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                if (Dados.controle[Pergunta.contador] == false) {
                    Dados.contadorSwipe++;
                    Dados.controle[Pergunta.contador] = true;
                }
                Dados.insereResposta(Pergunta.contador, false);
                if (Dados.contadorSwipe == 5) {
                    startActivity(intent);
                } else {
                    onSwipeRight();
                }


            }


            @Override
            public void onSwipeTop() {
                super.onSwipeBottom();
                if (Dados.controle[Pergunta.contador] == false) {
                    Dados.contadorSwipe++;
                    Dados.controle[Pergunta.contador] = true;
                }
                Dados.insereResposta(Pergunta.contador, true);
                if (Dados.contadorSwipe == 5) {
                    startActivity(intent);
                } else {
                    onSwipeRight();
                }


            }
            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                if (Pergunta.contador == 0) {
                    Pergunta.contador = Pergunta.retornaTamanhoArray();
                    pergunta.setText(Pergunta.retornaArray().get(Pergunta.contador));

                } else {
                    Pergunta.contador = (Pergunta.contador - 1);
                    pergunta.setText(Pergunta.retornaArray().get(Pergunta.contador));
                }

            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                if (Pergunta.contador == Pergunta.retornaTamanhoArray()) {
                    Pergunta.contador = 0;
                    pergunta.setText(Pergunta.retornaArray().get(Pergunta.contador));

                } else {
                    Pergunta.contador = (Pergunta.contador + 1);
                    pergunta.setText(Pergunta.retornaArray().get(Pergunta.contador));
                }
            }
        });


    }


}
