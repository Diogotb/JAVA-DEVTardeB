package POOExercicio2;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        //vetor de objetos
        Agenda obj[] = new Agenda[10]; //vetor de objetos 10
        for (int i = 0; i < obj.length; i++) {
            obj[i]= new Agenda();//construindo o objeto
            //preencher meu objeto
            obj[i].setNome("Pessoa"+i);
            obj[i].setAltura("alt"+i);
            obj[i].setIdade("Idade"+i);

        }
    }
}
