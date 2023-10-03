import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio5CardLayout extends JFrame {
    //atributo
    int pontuacao = 0;
    //construtor
    public Exercicio5CardLayout() {
        super("Exercicio 5");
        //painel principal -> CardLayout
        CardLayout cl = new CardLayout();
        JPanel mainP = new JPanel(cl);
        this.add(mainP);//add painel principal ao frame
        //criar os cards -> mainP
        // card1 - Start
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Bem Vindo ao Jogo"));
        JButton botao1 = new JButton("Começar");
        card1.add(botao1);
        mainP.add(card1,"Start");//atribuir o card ao painel principal com nome
        //card2 - Primeira Pergunta
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Quem foi o Campeão da Copa de 74?"));
        JTextField caixa1 = new JTextField(20);
        card2.add(caixa1);
        JButton botao2 = new JButton("Próxima");
        card2.add(botao2);
        mainP.add(card2,"P1");
        //card3 - Primeira Pergunta
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Quem foi Campeão da Copa de 2023?"));
        JTextField caixa2 = new JTextField(20);
        card3.add(caixa2);
        JButton botao3 = new JButton("Próxima");
        card3.add(botao3);
        mainP.add(card3,"P2");
        // card4 - Pontuação
        JPanel card4 = new JPanel();
        JLabel pontuacaoFinal = new JLabel();
        card4.add(pontuacaoFinal);
        JButton botao4 = new JButton("Reiniciar");
        card4.add(botao4);
        mainP.add(card4,"Final");
        //set Frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        //Tratamento de Eventos
        botao1.addActionListener(e->{
            cl.next(mainP);
        });
        botao2.addActionListener(e->{
            if(caixa1.getText().toLowerCase().equals("alemanha")){
                pontuacao++;
            }
            cl.next(mainP);
            caixa1.setText("");
        });
        botao3.addActionListener(e->{
            if(caixa2.getText().toLowerCase().equals("espanha")){
                pontuacao++;
            }
            cl.next(mainP);
            caixa2.setText("");
            pontuacaoFinal.setText("Sua pontuação foi de "+pontuacao);
        });
        botao4.addActionListener(e->{
            cl.first(mainP);
        });

    }
}
