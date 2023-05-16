package POOIntroducao;

public class App {
    public static void main(String[] args) {
        //criando objetos
        RegistraAluno aluno1 = new RegistraAluno();//criei um obj

       
        // setando os atributos(SET)
        aluno1.setNome("Ana Carla Pereira");
        aluno1.setEndereco("rua das Flores, 123");
        aluno1.setIdade(12);
        aluno1.setNotaCiencias(9.5);
        aluno1.setNotaMatematica(8.3);
        aluno1.setNotaPortugues(7.4);

        //mostrando os atributos com o GET
        System.out.println("Nome:"+aluno1.getNome());
    }
}
