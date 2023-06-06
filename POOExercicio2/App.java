package POOExercicio2;

import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Random rd = new Random();
        //criar um vetor para 10 objetos
        Agenda contatos[] = new Agenda[10];
        //criar os objetos e preencher os atributos do objeto
        for (int i = 0; i < contatos.length; i++) {
            //criar o objeto - construtor
            contatos[i] = new Agenda();
            //preencher os atributos (set)
            contatos[i].setNome(JOptionPane.showInputDialog(
                "Digite o Nome:"));
            contatos[i].setAltura(rd.nextDouble(1.5,2));
            contatos[i].setIdade(i+18);
        }
        //criar um metodos para busca uma pessoa do array
        String buscarNome = JOptionPane.showInputDialog(
            "Informe o nome a ser Buscado");
        boolean busca = true;
        int cont=0;
        while(busca){
            if(buscarNome.equals(contatos[cont].getNome())){
                busca = false;
                contatos[cont].imprimir();
            }
            cont++;
        }
    }
}
