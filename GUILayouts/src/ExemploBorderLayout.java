import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploBorderLayout extends JFrame{
    public ExemploBorderLayout() {
        super("Principal");
        //criando um Jpanel e Selecionando Layout
        JPanel painel1 = new JPanel(new BorderLayout());
        this.add(painel1);
        //criar os componentes
        painel1.add(new JButton("North"),BorderLayout.NORTH);
        painel1.add(new JButton("West"),BorderLayout.WEST);
        painel1.add(new JButton("South"),BorderLayout.SOUTH);
        painel1.add(new JButton("East"),BorderLayout.EAST);
        painel1.add(new JButton("Center"),BorderLayout.CENTER);
        //set frame
        this.pack();
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
    }
}
