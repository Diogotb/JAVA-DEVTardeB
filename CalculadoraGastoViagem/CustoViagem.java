package CalculadoraGastoViagem;

/**
 * CustoViagem
 */
public class CustoViagem {

    public static void main(String[] args) {
        //Escrever o Programa Aqui
        int distanciaPercorrida = 150;
        // distância em KM
        double consumoTransporte = 10;
        // Comsumo em KM/L
        double valorCombustivel = 4.99;
        //preço do combustivel em R$
        double litroCombustivel = distanciaPercorrida/consumoTransporte;
        //litros de combustivel
        double custoViagem = litroCombustivel*valorCombustivel;
        //Custo Viagem em R$

        System.out.println("O Custo da Viagem foi de "+custoViagem+" reais");
    }
}