package RevisaoFPOO;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Animais;
import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.OutrosAnimais;
import RevisaoFPOO.Horario.AgendaConsulta;

class App {

     public static void main(String[] args) {
          // criar o vetor de classes
          Gato gatos[] = new Gato[10];
          Cachorro cachorros[] = new Cachorro[10];
          OutrosAnimais outrosAnimais[] = new OutrosAnimais[10];
          AgendaConsulta agenda[] = new AgendaConsulta[100];
          // cadastro dos Animais
          // criar os contadores
          int contGatos = 0, contCachorros = 0, contOutros = 0, contAgenda = 0;
          boolean aberto = true;
          JOptionPane.showMessageDialog(null, "Seja Bem-Vindo ao Consultória \n do Dr. Franksthein ");

          while (aberto) {
               int acao1 = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastro \n2-Agendamento \n3-Sair"));
               if (acao1 == 1) {// Cadastro dos Animais
                    int acao2 = Integer
                              .parseInt(JOptionPane.showInputDialog("1- Gato \n2-Cachorro \n3-Outros Animais"));
                    if (acao2 == 1) {// Gato
                         gatos[contGatos] = new Gato();
                         // preeencher os atributos
                         gatos[contGatos].setNome(JOptionPane.showInputDialog("Informe o nome do PET"));
                         gatos[contGatos]
                                   .setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do PET")));
                         contGatos++;
                    } else if (acao2 == 2) {// Cachorro
                         cachorros[contCachorros] = new Cachorro();
                         // preeencher os atributos
                         cachorros[contCachorros].setNome(JOptionPane.showInputDialog("Informe o nome do PET"));
                         cachorros[contCachorros]
                                   .setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do PET")));
                         contCachorros++;// acrescenta o contador
                    } else if (acao2 == 3) {// Outros
                         outrosAnimais[contOutros] = new OutrosAnimais();
                         // preeencher os atributos
                         outrosAnimais[contOutros].setNome(JOptionPane.showInputDialog("Informe o nome do PET"));
                         outrosAnimais[contOutros]
                                   .setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do PET")));
                         contOutros++;
                    }
               } else if (acao1 == 2) {// agendamento
                    // 1º encontrar o pet cadastrado
                    String nomeAgenda = JOptionPane.showInputDialog("Informe o Nome do PET");
                    // comparar nos vetores(gatos/cachorros/outrosanimais)
                    boolean nomeOk = false;
                    for (int i = 0; i < contGatos; i++) {
                         if (nomeAgenda.equals(gatos[i].getNome())) {
                              JOptionPane.showMessageDialog(null, "Nome Encontrado");
                              nomeOk = true;
                              break;
                         }
                    }
                    for (int i = 0; i < contCachorros; i++) {
                         if (nomeAgenda.equals(cachorros[i].getNome())) {
                              JOptionPane.showMessageDialog(null, "Nome Encontrado");
                              nomeOk = true;
                              break;
                         }
                    }
                    for (int i = 0; i < contOutros; i++) {
                         if (nomeAgenda.equals(outrosAnimais[i].getNome())) {
                              JOptionPane.showMessageDialog(null, "Nome Encontrado");
                              nomeOk = true;
                              break;
                         }
                    }
                    // 2º verificar se horarios esta disponivel
                    if (nomeOk) {
                         // laço de repetição para agendamento
                         boolean registrarAgendamento = true;
                         while (registrarAgendamento) {
                              // pedir data e hora
                              String dataAgenda = JOptionPane
                                        .showInputDialog("Informe a Data do Agendamento\n [dd/mm/yyyy]");
                              String horaAgenda = JOptionPane
                                        .showInputDialog("Informe a Hora do Agendamento\n [hh:mm]");
                              if (contAgenda != 0) {
                                   for (int i = 0; i < contAgenda; i++) {
                                        if (agenda[i].getAgendamento().equals(dataAgenda + horaAgenda)) {
                                             // já existe um horário agendado
                                             JOptionPane.showMessageDialog(null, "Horario já agendado");
                                             break;
                                        } else {
                                             // 3º realizar agendamento
                                             agenda[contAgenda] = new AgendaConsulta(horaAgenda, dataAgenda);
                                             contAgenda++;
                                             registrarAgendamento = false;
                                        }
                                   }

                              } else {
                                   // 3º realizar agendamentoF
                                   agenda[contAgenda] = new AgendaConsulta(horaAgenda, dataAgenda);
                                   contAgenda++;
                                   registrarAgendamento = false;
                              }
                         }
                    }
               }
          }
     }
}