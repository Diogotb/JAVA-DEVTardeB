import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class Frame extends JFrame {
    // criação do tabbedPane para incluir as tabs
    private JTabbedPane jTPane;

    public Frame() {
        jTPane = new JTabbedPane();
        add(jTPane);
        // criandos as tabs
        // tab1 carros
        JanelaCarros tab1 = new JanelaCarros();
        jTPane.add("Carros", tab1);
        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * JanelaCarros
     *
     */
    public class JanelaCarros extends JPanel {
        private JButton cadastrar, cancelar, apagar, consultar, editar;
        private JTextField carMarcaField, carModeloField, carAnoField, carCorField,
                carValorField;
        ArrayList<Carros> listaCarros = new ArrayList<Carros>();
        private JTable jTable;

        public JanelaCarros() {
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            add(new JLabel("Cadastro Carros"));
            JPanel a = new JPanel();
            a.setLayout(new GridLayout(5, 2));
            a.add(new JLabel("Marca"));
            carMarcaField = new JTextField(20);
            a.add(carMarcaField);
            a.add(new JLabel("Modelo"));
            carModeloField = new JTextField(20);
            a.add(carModeloField);
            a.add(new JLabel("Ano"));
            carAnoField = new JTextField(20);
            a.add(carAnoField);
            a.add(new JLabel("Cor"));
            carCorField = new JTextField(20);
            a.add(carCorField);
            a.add(new JLabel("Valor"));
            carValorField = new JTextField(20);
            a.add(carValorField);
            add(a);
            JPanel botoes = new JPanel();

            botoes.add(cadastrar = new JButton("Cadastrar"));
            botoes.add(cancelar = new JButton("Cancelar"));
            botoes.add(consultar = new JButton("Consultar"));
            botoes.add(editar = new JButton("Editar"));
            botoes.add(apagar = new JButton("Apagar"));
            add(botoes);
            JScrollPane jSPane = new JScrollPane();
            add(jSPane);
            jTable = new JTable();
            jTable.setModel(new DefaultTableModel(new Object[][] {},
                    new String[] { "Marca", "Modelo", "Ano", "Cor", "Valor" }));
            jSPane.setViewportView(jTable);
        }

    }
}