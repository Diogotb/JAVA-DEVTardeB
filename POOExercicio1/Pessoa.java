package POOExercicio1;

import java.sql.Date;

import javax.xml.crypto.Data;

public class Pessoa {
    //atributos
    String nome;
    double altura;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    //construtor
    //sets and gets(métodos)
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getDiaNascimento() {
        return diaNascimento;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    //métodos solicitados
    //void ou return
    //printar todas as informações da pessoas
    public void imprimir() {
        System.out.println("Nome: "+nome);
        System.out.println("Altura: "+altura);
        System.out.println("Data Nascimento: "
        +diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
    }
    //calcular a idade da pessoa
    public void calculoIdade(){
        int idade=0;
        if(diaNascimento<=30 && mesNascimento<=5){
        idade = 2023-anoNascimento;
        } else{
            idade = 2023-anoNascimento - 1;
        }
        System.out.println("A idade é "+idade);
    }
    
}
