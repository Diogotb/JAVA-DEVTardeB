package IteracaoFor;

import java.util.Scanner;

public class ExerciciosFor {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int vetor[]=new int [5];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor["+i+"]=");
            vetor[i]=sc.nextInt();
        }
        System.out.println("====================");
        for (int i = 0; i < vetor.length; i++) {
           System.out.println("vetor["+i+"]="+vetor[i]); 
        }
    }
    public void exercicio2() {
        double vetor[]=new double [10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor["+i+"]=");
            vetor[i]=sc.nextDouble();
        }
        System.out.println("====================");
        for (int i = vetor.length-1;i>=0;i--){
            System.out.println("vetor["+i+"]="+vetor[i]);
        }
    }
}
