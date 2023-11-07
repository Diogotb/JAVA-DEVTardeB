package Controller;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Carros;

public class CarrosControl {
    // atributos
    private List<Carros> carros;
    private DefaultTableModel tableModel;
    private JTable table;

    // cosntrutor
    public CarrosControl(List<Model.Carros> carros, DefaultTableModel tableModel, JTable table) {
        this.carros = carros;
        this.tableModel = tableModel;
        this.table = table;
    }

    // métodos do CRUD
    public void cadastrarCarros(String marca, String modelo, String ano, String placa, String valor) {
        // new CarrosDAO().inserir(marca, modelo, ano, placa, valor);
        Carros carro = new Carros(marca, modelo, ano, placa, valor);
        carros.add(carro);
        atualizarTabela();
    }

    public void atualizarCarros(int linhaSelecionada, String marca, String modelo, String ano, String placa,
            String valor) {
        if (linhaSelecionada != -1) {
            Carros carro = new Carros(marca, modelo, ano, placa, valor);
            carros.add(carro);
            atualizarTabela();
        }
    }

    public void apagarCarro(int linhaSelecionada) {
        if (linhaSelecionada != -1) {
            carros.remove(linhaSelecionada);
            atualizarTabela();
        }
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        // carros = new CarrosDAO().read();
        Object linha[] = new Object[5];
        for(int i=0;i<carros.size();i++){
        linha[0] = carros.get(i).marca;
        linha[1] = carros.get(i).modelo;
        linha[2] = carros.get(i).ano;
        linha[3] = carros.get(i).placa;
        linha[4] = carros.get(i).valor;
        tableModel.addRow(linha);
        }
    }
    

}
