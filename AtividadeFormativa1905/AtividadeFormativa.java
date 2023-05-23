import java.util.Random;
import java.util.Scanner;

public class AtividadeFormativa {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void atividade1() {
        //pedir para o usuario informar o nº de linhas e colunas
        System.out.println("Informe");
        int linha = sc.nextInt();
        int coluna = sc.nextInt();
        //criar a matriz
        int matriz[][] = new int[linha][coluna];
        //preencher a matriz com valores aleatórios
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = rd.nextInt(10);
            }
        }
        //imprimir
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        //substituir a matriz com os valores da condição
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                //condição
                if(i>j){
                    matriz[i][j]=1;
                } else if(i==j){
                    matriz[i][j]=0;
                } else{
                    matriz[i][j]=2;
                }
            }
        }
        //imprimir
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    //atividade2
    public void atividade2() {
        int nSorteado = rd.nextInt(1000);
        int nDigitado = -1;//fugir do range
        int contador = 0;
        while(nDigitado != nSorteado){
            contador++;
            System.out.println("Digite um nº entre 0 e 999");
            nDigitado = sc.nextInt();
            //condições
            if(nDigitado>nSorteado){
                System.out.println("Errou!! o nº é maior que o sorteado");
            } else if(nDigitado<nSorteado){
                System.out.println("Errou!! nº Digitado é Menor que nº Sorteado");
            } else{
                System.out.println("Acertou!!!");
                System.out.println("Em "+contador+" tentativas");
            }

        }

    }
    public void atividade3() {
        //criar um vetor 100 - 1000
        int vetor[] = new int[rd.nextInt(900)+100];
        //preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100)+1;
        }
        //procurar os impares e imprimir
        int contImparNoPar=0;
        int contParNoImpar=0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2 ==1){
                System.out.println(vetor[i]);
                if(i%2 ==1){
                    contImparNoPar++;
                }
            }
        }
        //procurar os pares e imprimir
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2 ==0){
                System.out.println(vetor[i]);
                if(i%2 ==0){
                    contParNoImpar++;
                }
            }
        }
        //contar os Impares na posição Par
        contImparNoPar = 0;
        contParNoImpar = 0;
        for (int i = 1; i < vetor.length; i+=2) {
            if(vetor[i]%2==1){
                contImparNoPar++;
            }
        }
        //contar os Pares na posição Impar
        for (int i = 0; i < vetor.length; i+=2) {
            if(vetor[i]%2==0){
                contParNoImpar++;
            }
        }
    }
}
