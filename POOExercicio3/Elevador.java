package POOExercicio3;

public class Elevador {
    //atributos
    int nMaxAndares;
    int nMaxPessoas;
    int andarAtual;
    int qtdPessoasAtual;
    //métodos
    //cosntrutor
    public Elevador(int nMaxAndares, int nMaxPessoas) {
        this.nMaxAndares = nMaxAndares;
        this.nMaxPessoas = nMaxPessoas;
    }
    //gets and sets
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getQtdPessoasAtual() {
        return qtdPessoasAtual;
    }
    public void setQtdPessoasAtual(int qtdPessoasAtual) {
        this.qtdPessoasAtual = qtdPessoasAtual;
    }
    //métodos próprios
    public void inicializa() {
        andarAtual = 0;
        qtdPessoasAtual = 0;
    }
    //entra
    public int entra(){
        if(qtdPessoasAtual<nMaxPessoas){
        qtdPessoasAtual++;
        }else{
            System.out.println("Não vai subir Ningué!!!");
        }
        return qtdPessoasAtual;
    }
    //sai
    public int sai(){
        if(qtdPessoasAtual>0){
        qtdPessoasAtual--;
        }else{
            System.out.println("Não tem ninguém para descer");
        }
        return qtdPessoasAtual;
    }
    //subir
    public int subir(int nAndares){
        if(andarAtual+nAndares<=nMaxAndares){
            andarAtual+=nAndares;
        } else{
            System.out.println("Digite um nº válido para subir");
        }
        return andarAtual;
    }
    //descer
    public int descer(int nAndares){
        if(andarAtual-nAndares>=0){
            andarAtual-=nAndares;
        } else{
            System.out.println("Digite um nº válido para descer");
        }
        return andarAtual;
    }   
}
