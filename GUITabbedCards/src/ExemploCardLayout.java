import java.util.concurrent.CancellationException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

public class ExemploCardLayout extends JFrame {
    public ExemploCardLayout() {
        super("Exemplo CardLayout");
        // criando um painel
        JPanel painel1 = new JPanel();
        // criando um comboBox
        String comboBoxItens[] = { "Card1", "Card2" };// string p combobox
        JComboBox cb = new JComboBox(comboBoxItens);// instanciando a combobox
        painel1.add(cb);
        // criar os cards
        // Criando os Cards
        JPanel card1 = new JPanel();
        card1.add(new JButton("Botão 1"));
        card1.add(new JButton("Botão 2"));
        card1.add(new JButton("Botão 3"));
        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField", 20));
        // Painel que vai conter os meus cards
        CardLayout cl = new CardLayout();
        JPanel cards = new JPanel(cl);
        cards.add(card1, "Card1");
        cards.add(card2, "Card2");
        this.add(painel1);
        painel1.add(cards);
        // set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        cb.addItemListener(e->{
            // cards.getLayout();
            cl.show(cards, (String) e.getItem());
        });
    }
}
