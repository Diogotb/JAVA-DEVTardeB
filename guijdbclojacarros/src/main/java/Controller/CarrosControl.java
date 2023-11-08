package Controller;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Model.Carros;
import logs.RegistroOperacoes;

/**
 * CarrosControl
 */
public class CarrosControl {

    // Atributos
    private List<Carros> carros; // Lista de objetos Carros
    private DefaultTableModel tableModel; // Modelo da tabela Swing para exibição dos dados
    private JTable table; // Tabela Swing onde os dados são exibidos

    // Construtor
    public CarrosControl(List<Carros> carros, DefaultTableModel tableModel, JTable table) {
        this.carros = carros; // Inicializa a lista de carros
        this.tableModel = tableModel; // Inicializa o modelo da tabela
        this.table = table; // Inicializa a tabela Swing
    }

    // Método para atualizar a tabela de exibição com dados do banco de dados
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        carros = new CarrosDAO().listarTodos(); // Obtém os carros atualizados do banco de dados
        for (Carros carro : carros) {
            // Adiciona os dados de cada carro como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { carro.getMarca(), carro.getModelo(), carro.getAno(), carro.getPlaca(), carro.getValor() });
        }
    }

    // Método para cadastrar um novo carro no banco de dados
    public void cadastrar(String marca, String modelo, String ano, String placa, String valor) {
        new CarrosDAO().cadastrar(marca, modelo, ano, placa, valor);
        
        // Chama o método de cadastro no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
        
    }

    // Método para atualizar os dados de um carro no banco de dados
    public void atualizar(String marca, String modelo, String ano, String placa, String valor) {
        new CarrosDAO().atualizar(marca, modelo, ano, placa, valor); 
        // Chama o método de atualização no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    // Método para apagar um carro do banco de dados
    public void apagar(String placa) {
        new CarrosDAO().apagar(placa); 
        // Chama o método de exclusão no banco de dados
        atualizarTabela(); // Atualiza a tabela de exibição após a exclusão
    }
}
