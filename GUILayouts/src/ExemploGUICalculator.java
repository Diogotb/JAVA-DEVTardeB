import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ExemploGUICalculator extends JFrame {
    String valores[] = {"7", "8", "9","x","6","5","4","-","3","2","1","+","/","0",".","="};
    public ExemploGUICalculator() {
        super("Calculadora");
        //painel principal tipo border
        JPanel painel1 = new JPanel(new BorderLayout());
        this.add(painel1);
        //add texto ao north
        painel1.add(new JTextField(15),BorderLayout.NORTH);
        //add painel2 ao center
        JPanel painel2 = new JPanel(new GridLayout(4,4));
        painel1.add(painel2,BorderLayout.CENTER);
        //preencher o painel 2
        for (int i = 0; i < valores.length; i++) {
            painel2.add(new JButton(valores[i]));
        }
        //set do frame
        this.pack();
        this.setDefaultCloseOperation(2);
        this.setVisible(true);

    }
}
