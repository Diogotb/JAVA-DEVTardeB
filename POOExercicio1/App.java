package POOExercicio1;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        String valor = JOptionPane.showInputDialog("Nome:");
        pessoa1.setNome(valor);
    }
}
