package Controller;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Carros;

/**
 * CarrosControl
 */
public class CarrosControl {

    // atributos
    private List<Carros> carros;
    private DefaultTableModel tableModel;
    private JTable table;

    // construtor
    public CarrosControl(List<Carros> carros, DefaultTableModel tableModel, JTable table) {
        this.carros = carros;
        this.tableModel = tableModel;
        this.table = table;
    }

    // métodos do CRUD
    private void atualizarTabela() {
        // atualizar tabela pelo banco de dados
        tableModel.setRowCount(0);
        carros = new CarrosDAO().listarTodos();
        for (Carros carro : carros) {
            tableModel.addRow(new Object[] { carro.getMarca(), carro.getModelo(), carro.getAno(), carro.getPlaca(),
                    carro.getValor() });
        }

    }

    public void cadastrar(String marca, String modelo, String ano, String placa, String valor) {
        //criar métodos de controles
        new CarrosDAO().cadastrar(marca, modelo, ano, placa, valor);
        atualizarTabela();
    }

    public void atualizar(String marca, String modelo, String ano, String placa, String valor){
        new CarrosDAO().atualizar(marca, modelo, ano, placa, valor);
        atualizarTabela();
    }
    public void apagar(String placa){
        new CarrosDAO().apagar(placa);
        atualizarTabela();
    }

}