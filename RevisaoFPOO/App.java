package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Animais;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.OutrosAnimais;
import RevisaoFPOO.Horario.AgendaConsulta;

class App {

    public static void main(String[] args) {
       //criar o vetor de classes
       Gato gatos[] = new Gato[10];
       Cachorro cachorros[] = new Cachorro[10];
       OutrosAnimais outrosAnimais[] = new OutrosAnimais[10];
       AgendaConsulta agenda[] = new AgendaConsulta[100];
       // cadastro dos Animais
       //criar os contadores
       int contGatos = 0, contCachorros=0, contOutros=0;
       boolean aberto = true;
       JOptionPane.showMessageDialog(null, "Seja Bem-Vindo ao Consultória \n do Dr. Franksthein ");

       while(aberto){
            int acao = Integer.parseInt(JOptionPane.showInputDialog("1-Cadastro Gato\n 2-Cadastro Cachorro \n 3-Cadastro Outros Animais \n 4-Sair"));

       }
        }
}