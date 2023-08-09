package Colecoes;

import java.util.*;

import javax.swing.JOptionPane;

public class ExemploArrayList {
    // criando o ArrayList
    ArrayList<String> carros = new ArrayList<>();
    ArrayList<Integer> num = new ArrayList<>();

    public void teste() {
        //Adicionando Elementos com ADD
        carros.add("Fusca");
        carros.add("Brasília");
        carros.add("Chevette");
        carros.add("Monza");
        carros.add("Monza");
        //Imprimindo a lista Completa
        System.out.println(carros);
        //Ordenando a Lista(.sort(Collections))
        Collections.sort(carros);//ordenação em Alfabética
        System.out.println(carros);
        Collections.reverse(carros);//inverte a lista
        System.out.println(carros);
        //percorrer a Lista(for)
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        //percorrendo a Lista com For-Each
        for (String i : carros) {
            System.out.println(i);
        }
        //Limpando a Lista
        carros.clear();
        System.out.println(carros);
    }
    public void exercicio1(){
        //criar um arraylista de nº inteiros
        //escrever 5 nº aleatórios - ordenar e imprimir
        for (int i = 0; i < 5; i++) {
            num.add(Integer.parseInt(JOptionPane.showInputDialog("Digite Um Nº")));
        }
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);
    }

}
