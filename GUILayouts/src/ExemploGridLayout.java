import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ExemploGridLayout
 */
public class ExemploGridLayout extends JFrame{
    public ExemploGridLayout() {
        super("Janela Principal");
        JPanel painel1 = new JPanel();
        this.add(painel1);
        //mudar o Layout do Jpanel Flow -> Grid
        GridLayout grid = new GridLayout(3,3);
        painel1.setLayout(grid);
        //adicionar componentes no Jpanel
        for (int i = 0; i < 9; i++) {
            painel1.add(new JButton(""+i));
        }
        //set do frame
        this.pack();
        this.setDefaultCloseOperation(2);
        this.setVisible(true);

    }
    
}