package Control;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Agenda;

public class OperacoesAgendamento {
    // atributos
    private List<Agenda> agendas;
    private DefaultTableModel tableModel;
    private JTable table;
    
    //construtor
    public OperacoesAgendamento(List<Agenda> agendas, DefaultTableModel tableModel, JTable table) {
        this.agendas = agendas;
        this.tableModel = tableModel;
        this.table = table;
    }

    //métodos CRUD
    public void cadastrarAgenda(String data, String hora, String usuario, String descricao) {
        Agenda agenda = new Agenda(data, hora, usuario, descricao);//criando um obj da Classe Agenda
        agendas.add(agenda);
        atualizarTabela();
    }

    public void atualizarAgenda(int linhaSelecionada, String data, String hora, String usuario, String descricao) {
        if (linhaSelecionada != -1) {
            Agenda agenda = new Agenda(data, hora, usuario, descricao);//criando um obj da Classe Agenda
            agendas.set(linhaSelecionada,agenda);
            atualizarTabela();
        }
    }

    public void apagarAgenda(int linhaSelecionada) {
        if (linhaSelecionada != -1) {
            agendas.remove(linhaSelecionada);
            atualizarTabela();
        }
    }

    public void salvarAgenda() {
        Serializacao.serializarAgenda("dados.txt", agendas);
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Agenda agenda : agendas) {
            tableModel.addRow(new Object[] { agenda.getData(), agenda.getHora(), agenda.getUsuario(), agenda.getDescricao() });
        }
    }
}
