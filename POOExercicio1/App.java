package POOExercicio1;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Juliana");
        pessoa1.setAltura(1.67);
        pessoa1.setDiaNascimento(25);
        pessoa1.setMesNascimento(12);
        pessoa1.setAnoNascimento(2000);
        pessoa1.imprimir();
        pessoa1.calculoIdade();
    }
}
