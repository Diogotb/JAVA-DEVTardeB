package POOExercicio2;

import javax.swing.JOptionPane;

public class Agenda {
    // atributos
    String nome;
    int idade;
    double altura;

    // métodos
    // construtor com parametros
    public Agenda(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    // cosntrutor vazio
    public Agenda() {
    }
    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // métodos de aplicação diversas
    // imprimir (void)
    public void imprimir() {
        JOptionPane.showMessageDialog(null,
                "Nome: " + nome
                + "\nAltura: " + altura
                + "\nIdade: " + idade);
    }

}
