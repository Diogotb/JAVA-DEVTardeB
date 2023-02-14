package CalcularVelocidadeMedia;

public class CalcularVelocidadeMedia {
    public static void main(String[] args) {
        System.out.println("===Calcular a Velocidade Média===");
        double distanciaPercorrida = 150;
        System.out.println("A Distancia é "
        +distanciaPercorrida+" KM");
        double tempoGasto = 2;
        System.out.println("O Tempo de Viagem foi de "
        +tempoGasto+" horas");
        double velocidadeMedia = distanciaPercorrida/tempoGasto;
        System.out.println("A Velocidade Média foi de "
        +velocidadeMedia+" Km/h");
    }
}
