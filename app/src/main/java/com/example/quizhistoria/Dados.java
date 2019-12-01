package com.example.quizhistoria;

public class Dados {
    public static int contadorSwipe = 0;
    public static boolean[][] matriz = new boolean[2][5];
    public static boolean[] controle = new boolean[5];

    public static void populaControle() {
        controle[0] = false;
        controle[1] = false;
        controle[2] = false;
        controle[3] = false;
        controle[4] = false;
    }

    public static void populaMatriz() {
        matriz[0][0] = true;
        matriz[0][1] = false;
        matriz[0][2] = true;
        matriz[0][3] = false;
        matriz[0][4] = true;
    }

    public static void insereResposta(int indice, boolean valor) {
        matriz[1][indice] = valor;
    }

    public static String contaAcertos() {
        int acertos = 0;
        for (int i = 0; i <= 4; i++) {
            if (matriz[1][i] == matriz[0][i]) {
                acertos++;
            }
        }

        return Integer.toString(acertos);
    }

}
