package View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JanelaPrincipal extends JFrame{
     // criação do tabbedPane para incluir as tabs
    private JTabbedPane jTPane;

    public JanelaPrincipal() {
        jTPane = new JTabbedPane();
        add(jTPane);
        // criandos as tabs
        // tab1 carros
        CarrosPainel tab1 = new CarrosPainel();
        VendasView tab3 = new VendasView();
        jTPane.add("Carros", tab1);
        jTPane.add("Vendas", tab3);

        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        jTPane.addChangeListener(e->{
            tab3.atualizarComboBox();
        });

    }
    //métodos para tornar a janela visível
    public void run(){
        this.setVisible(true);
     }
}
