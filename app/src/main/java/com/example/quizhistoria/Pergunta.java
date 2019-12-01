package com.example.quizhistoria;

import java.util.ArrayList;

public class Pergunta {

    public static int contador = 0;

    public static int retornaTamanhoArray() {
        return 4;
    }

    public static ArrayList<String> retornaArray() {
        final ArrayList<String> question = new ArrayList();

        question.add("1 - É verdade que no final do século XVIII a importação de chá correspondia a ~10% dos gastos da inglaterra?");
        question.add("2 - É verdade que o imperadores da china facilitavam no geral o comércio estrangeiro historicamente?");
        question.add("3 - É verdade que a companhia de comércio das indias orientais contribuiu para o contrabando de drogas na china no século XIV?");
        question.add("4 - É verdade que a Guerra Fria passou a ser chamada desta maneira por se passar no mais longo inverno da história?");
        question.add("5 - É verdade que a dinastia Zhou foi a mais longa dinastia chinesa?");

        return question;
    }


}
