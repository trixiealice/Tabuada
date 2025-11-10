package model;

import java.util.Scanner;

public class Tabuada {

    public int multiplicando;
    public int multiplicadorInicial;
    public int multiplicadorFinal;
    public String[] tabuada;

    public void coletardados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é o valor do multiplicando? ");
        multiplicando = leitor.nextInt();

        System.out.println("Qual o valor do multiplicador inicial? ");
        multiplicadorInicial = leitor.nextInt();

        System.out.println("Qual o valor do multiplicador final? ");
        multiplicadorFinal = leitor.nextInt();


    }

    public void calcularTabuada(){
        int apoio = 0;

        if (multiplicadorFinal < multiplicadorInicial){
            apoio = multiplicadorFinal;
            multiplicadorFinal = multiplicadorInicial;
            multiplicadorInicial = apoio;
        }

        int tamanho = multiplicadorFinal -  multiplicadorInicial + 1;
        tabuada = new String[tamanho];

        int i =0;
        while (i < tamanho){
            int produto = multiplicando * multiplicadorInicial;
            tabuada[i] = multiplicando + " X " + multiplicadorInicial + " = "  + produto;
            multiplicadorInicial = multiplicadorInicial + 1;
            i = i + 1;
        }

        exibirTabuada();

    }

    public void exibirTabuada(){
        System.out.println("Resultado da sua tabuada:");

        int i = 0;
        while (i < tabuada.length){
            System.out.println(tabuada[i]);
            i++; // i =mi + 1

        }
    }
}
