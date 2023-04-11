package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        int i=0;
        while(i<10){
            System.out.println("O nº da Iteração é "+i);
            i++;//i=i+1; i+=1; 
        }
    }

    public void exemplo2() {
        int vetor[]= new int[10];
        int i=0;
        while(i<10){
            System.out.print("Informe o valor do vetor["+i+"]=");
            vetor[i]=sc.nextInt();
            i++;
        }

        while(i>0){
            i--;
            System.out.println("vetor["+i+"]="+vetor[i]);
        }
    }

    public void exemplo3() {
        Random rd = new Random();
        int nAleatorio = rd.nextInt(10)+1;
        boolean tenteNovamente = true;
        while(tenteNovamente){
            System.out.println("Digite um nº de 1 a 10");
            int nDigitado = sc.nextInt();
            if(nDigitado==nAleatorio){
                System.out.println("Acertouuuuu!!!Miseravi");
                tenteNovamente = false;
            } else{
                System.out.println("Errouuuu!!!!Misera");
            }
        }
    }
}
