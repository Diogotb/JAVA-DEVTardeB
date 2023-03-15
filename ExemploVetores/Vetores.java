package ExemploVetores;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);
    //criando método
    public void exemplo1() {
        //criando um vetor
        double[] valores = new double[]{10.5,20.7,30.6,40.4};
        System.out.println("1º Posição- Índice[0]:"+valores[0]);
        System.out.println("2º Posição- Índice[1]:"+valores[1]);
        System.out.println("3º Posição- Índice[2]:"+valores[2]);
        System.out.println("4º Posição- Índice[3]:"+valores[3]);
        // Mudando valores de uma posição definida
        valores[0] = 15.6; // Mudando o valore do Índice[0]
        System.out.println("1º Posição- Índice[0]:"+valores[0]);              
    }

    public void exemplo2() {
        //criando o vetor
        int[] novoValores = new int[5];
        // int novoValores[]=new int[5];
        novoValores[0]= 10;
        novoValores[1]= 20;
        novoValores[2]= 35;
        novoValores[3]= 67;
        novoValores[4]= 98;
        System.out.println("O vetor é : posição [0]= "+novoValores[0]);
        System.out.println("O vetor é : posição [1]= "+novoValores[1]);
        System.out.println("O vetor é : posição [2]= "+novoValores[2]);
        System.out.println("O vetor é : posição [3]= "+novoValores[3]);
        System.out.println("O vetor é : posição [4]= "+novoValores[4]);
    }

    public void exemplo3() {
        double valores[] = new double[10];
        System.out.println("Digite 10 nºs");
        valores[0]=sc.nextDouble();
        valores[1]=sc.nextDouble();
        valores[2]=sc.nextDouble();
        valores[3]=sc.nextDouble();
        valores[4]=sc.nextDouble();
        valores[5]=sc.nextDouble();
        valores[6]=sc.nextDouble();
        valores[7]=sc.nextDouble();
        valores[8]=sc.nextDouble();
        valores[9]=sc.nextDouble();
        System.out.println("O vetor é : posição [9]= "+valores[9]);
        System.out.println("1º Posição- Índice[0]:"+valores[0]);


    }

}
