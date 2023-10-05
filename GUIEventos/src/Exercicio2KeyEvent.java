import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Exercicio2KeyEvent
 */
public class Exercicio2KeyEvent extends JFrame {
    //atributo
    JLabel letra;
    JLabel textoCompleto;
    JTextField caixaTexto;
    //construtor
    public Exercicio2KeyEvent() {
        super("Exercicio2");
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 400, 400);
        JPanel mainPanel = new JPanel(new GridLayout(4,1));
        JPanel primeiroPanel = new JPanel();
        primeiroPanel.add(new JLabel("Letra Digitada: "));
        letra = new JLabel();
        primeiroPanel.add(letra);
        mainPanel.add(primeiroPanel);
        mainPanel.add(new JLabel("Digite seu Texto Aqui"));
        caixaTexto = new JTextField();
        mainPanel.add(caixaTexto);
        textoCompleto = new JLabel();
        mainPanel.add(textoCompleto);
        //set frame
        this.add(mainPanel);
        this.setVisible(true);
        //tratamento de eventos
        Handler evt = new Handler();
        caixaTexto.addKeyListener(evt);

    }
    //criar um handler
    /**
     * Handler
     */
    public class Handler implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            char keyPressed = e.getKeyChar(); //peguei o valor da tecla pressionada
            letra.setText(""+keyPressed);
        }

        @Override
        public void keyPressed(KeyEvent e) {
           
        }

        @Override
        public void keyReleased(KeyEvent e) {
            textoCompleto.setText(caixaTexto.getText());
        }
        
        
        
    }

}