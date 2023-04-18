package IteracaoFor;

import java.util.Scanner;

public class ExerciciosFor {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        int vetor[] = new int[5];// criar o vetor
        // preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor[" + i + "]=");
            vetor[i] = sc.nextInt();
        }
        // imprimir o vetor
        System.out.println("====================");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
        }
    }

    public void exercicio2() {
        double vetor[] = new double[10];// criar o vetor
        // preencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor[" + i + "]=");
            vetor[i] = sc.nextDouble();
        }
        // imprimir o vetor na ordem inversa 9-0
        System.out.println("====================");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
        }
    }

    // exercicio3 - notas de 1 aluno
    public void exercicio3() {
        // criar um vetor para recerber as 4 notas
        double vetorNotas[] = new double[4];// {nota[0],nota[1],nota[2],nota[3]}
        // preencher o vetor com as 4 notas "fori"
        for (int i = 0; i < vetorNotas.length; i++) {
            // pedir para digitar a nota e ler a nota digitada
            System.out.print("Informe a nota " + (i + 1) + " do Aluno:");
            vetorNotas[i] = sc.nextDouble();
        }
        // printar as notas e calcular a media "fori"
        double media = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Nota " + (i + 1) + "=" + vetorNotas[i]);
            media += vetorNotas[i];// acumular o valor das notas do vetor
        }
        // dividira a média pelo nº de notas do vetor
        media /= vetorNotas.length;
        // mostra a média
        System.out.println("A média do aluno é " + media);
    }

    // exercicio4 - ler 10 caracteres contar as consoantes
    public void exercicio4() {
        // criar um vetor de 10 caracteres
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        // percorrer o vetor para achar as consoantes "fori"
        int cont = 0;// contador para consoantes
        for (int i = 0; i < letras.length; i++) {
            // tomada de decisão: vogal ou consoante
            if (letras[i] != "a" && letras[i] != "e" && letras[i] != "i" && letras[i] != "o" && letras[i] != "u") {
                System.out.println(letras[i] + " é consoante");
                cont++;
            }
        }
        // mostrar o nº de consoantes
        System.out.println("o nº de consoantes é " + cont);

    }

    // exercico 4 extra - contanto consoantes de uma palavra
    public void exercicio4Ex() {
        // Usuário vai digitar a palavra
        System.out.println("Digite uma Palavra");
        String letras = sc.next();
        letras = letras.toLowerCase();
        // percorrer o vetor para achar as consoantes "fori"
        int cont = 0;// contador para consoantes
        for (int i = 0; i < letras.length(); i++) {
            // tomada de decisão: vogal ou consoante
            char c = letras.charAt(i); //

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.println(c + " é consoante");
                cont++;
            }
        }
        // mostrar o nº de consoantes
        System.out.println("o nº de consoantes é " + cont);

    }

    // Exercicio 5 - 20 nº determinar pares e impares em outros vetores
    public void exercicio5() {
        int vetorNumeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int contPar = 0;// contador de nº Pares
        int contImpar = 0;// contador de nº Impares
        // percorrer o meu vetor e contar os nº pares e Impares
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        int nPar[] = new int[contPar];
        int nImpar[] = new int[contImpar];
        // distribuir os nº nos vetores Par e Impar
        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 == 0) { // se nº for Par
                nPar[contPar] = vetorNumeros[i];
                contPar++;// acréscimo do contador
            } else { // se nº for Impar
                nImpar[contImpar] = vetorNumeros[i];
                contImpar++;// acréscimo do contador
            }
        }
        // Imprimindo os vetores
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("vetor[" + i + "]=" + vetorNumeros[i]);
        }
        for (int i = 0; i < nPar.length; i++) {
            System.out.println("vetorPar[" + i + "]=" + nPar[i]);
        }
        for (int i = 0; i < nImpar.length; i++) {
            System.out.println("vetorImpar[" + i + "]=" + nImpar[i]);
        }
    }
    public void exercico5Gb() {
        int numeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int nPar[]=new int[numeros.length];
        int nImpar[]=new int[numeros.length];
    }

}
