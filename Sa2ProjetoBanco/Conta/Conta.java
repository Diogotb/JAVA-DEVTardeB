package Sa2ProjetoBanco.Conta;

public abstract class Conta {
    //atributos básicos
    String nome;
    int nConta;
    double saldo;
    //métodos
    //construtor default(vazio)
    //gets and sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getnConta() {
        return nConta;
    }
    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
