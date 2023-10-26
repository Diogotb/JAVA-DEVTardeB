package View;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseEvent;
import java.io.File;

import Control.OperacoesAgendamento;
import Control.OperacoesUsuario;
import Control.Serializacao;
import Model.Agenda;
import Model.Usuario;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class Agendamento extends JPanel {
    //atributos
    private JTextField inputData;
    private JTextField inputHora;
    private JTextField inputUsuario;
    private JTextField inputDescricao;
    private DefaultTableModel tableModel;
    private JTable table;
    private List<Agenda> agendas = new ArrayList<>();
    private int linhaSelecionada = -1;
    private JButton cadastrarButton, atualizarButton, apagarButton, salvarButton;

    //construtor
    public Agendamento() {
         // construir minha tabela
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Data");
        tableModel.addColumn("Hora");
        tableModel.addColumn("Usuário");
        tableModel.addColumn("Descrição");
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        // criar os componentes
        inputData = new JTextField(8);
        inputHora = new JTextField(5);
        inputUsuario = new JTextField(10);
        inputDescricao = new JTextField(20);
        cadastrarButton = new JButton("Cadastrar");
        atualizarButton = new JButton("Atualizar");
        apagarButton = new JButton("Apagar");
        salvarButton = new JButton("Salvar");

        // add os componentes
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Data:"));
        inputPanel.add(inputData);
        inputPanel.add(new JLabel("Hora:"));
        inputPanel.add(inputHora);
        inputPanel.add(new JLabel("Usuário:"));
        inputPanel.add(inputUsuario);
        inputPanel.add(new JLabel("Descrição:"));
        inputPanel.add(inputDescricao);
        inputPanel.add(cadastrarButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(salvarButton);

        // set do Layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Criação do Arquivo Binário
        File arquivoAgenda = new File("dadosAgenda.txt");
        if (arquivoAgenda.exists()) {
            agendas = Serializacao.deserializarAgenda("dadosAgenda.txt");
            atualizarTabela();
        }

        //Tratamento de Eventos
         table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputData.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputHora.setText(table.getValueAt(linhaSelecionada, 1).toString());
                    inputUsuario.setText(table.getValueAt(linhaSelecionada, 2).toString());
                    inputDescricao.setText(table.getValueAt(linhaSelecionada, 3).toString());
                }
            }
        });
        OperacoesAgendamento operacoes = new OperacoesAgendamento(agendas, tableModel, table);

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.cadastrarAgenda(inputData.getText(), inputHora.getText(), inputUsuario.getText(), inputDescricao.getText());
                inputData.setText("");
                inputHora.setText("");
                inputUsuario.setText("");
                inputDescricao.setText("");
            }
        });
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.atualizarAgenda(linhaSelecionada,(String) table.getValueAt(linhaSelecionada, 0),
                (String) table.getValueAt(linhaSelecionada, 1),
                (String) table.getValueAt(linhaSelecionada, 2),
                (String) table.getValueAt(linhaSelecionada, 3) );
            }
        });
        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarAgenda(linhaSelecionada);
            }
        });
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.salvarAgenda();
            }
        });
    }
    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Agenda agenda : agendas) {
            tableModel.addRow(new Object[] { agenda.getData(), agenda.getHora(), agenda.getUsuario(), agenda.getDescricao() });
        }
    }
}
