package POOExercicio3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // criar o elevador
        Elevador elevador1 = new Elevador(10, 10);
        // iniciar
        elevador1.inicializa();
        boolean ligado = true;
        // loop do elevador
        while (ligado) {
            System.out.println("Digite a ação desejada"
                    + "\n1-Entrar"
                    + "\n2-Sair"
                    + "\n3-Subir"
                    + "\n4-Descer"
                    + "\n5-Desligar");
            int acao = sc.nextInt();
            switch (acao) {
                case 1:
                    System.out.println("Capacidade Atual: " + elevador1.entra());
                    break;
                case 2:
                    System.out.println("Capacidade Atual: " + elevador1.sai());
                    break;
                case 3:
                    System.out.println("Quantos Andares Deseja Subir");
                    System.out.println("Andar Atual: " + elevador1.subir(sc.nextInt()));
                    break;
                case 4:
                    System.out.println("Quantos Andares Deseja Descer");
                    System.out.println("Andar Atual: " + elevador1.descer(sc.nextInt()));
                    break;
                case 5:
                    ligado = false;
                default: 
                    System.out.println("Digite um ação válida");
                    break;
            }
        }
    }
}
