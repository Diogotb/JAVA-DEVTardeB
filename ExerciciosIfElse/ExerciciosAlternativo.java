package ExerciciosIfElse;

import java.util.Scanner;

public class ExerciciosAlternativo {
    
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Digite um Número:");
        int numero1 = sc.nextInt();
        System.out.println("Digite outro Número:");
        int numero2 = sc.nextInt();
        if (numero1>numero2){
            System.out.println(" O Primeiro nº é Maior "+numero1 );
        } else
        if (numero2>numero1){
            System.out.println(" o Segundo nº é Maior "+numero2);
        }else{
            System.out.println(" Os nº são Iguais");
        }
    }
    public void exercicio2() {
        
    }
    public void exercicio3() {
        
    }
    public void exercicio4() {
        System.out.println("Informe o nº de Maças");
        int nMacas = sc.nextInt();
            double valorMacas=0;
        if(nMacas<12){
            valorMacas = 0.3;
        }
        if(nMacas>=12){
            valorMacas = 0.25;
        }
        double valorCompra = nMacas*valorMacas;
        
    }
    public void exercicio5() {
        
    }
    public void exercicio6() {
        
    }
}
