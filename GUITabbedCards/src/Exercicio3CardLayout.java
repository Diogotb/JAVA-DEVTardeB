import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;

public class Exercicio3CardLayout extends JFrame {
    public Exercicio3CardLayout() {
        super("Exercicio 3");
        //Painel Principal
        JPanel mainPanel = new JPanel(new BorderLayout());
        //Painel para adicionar os Cards
        JPanel cardsPanel = new JPanel();
        //setlayout do cardsPanel como CardLayout
        CardLayout cl = new CardLayout();
        cardsPanel.setLayout(cl);
        //criar os Cards
        JPanel home = new JPanel();//nome e 2 botoes
        JPanel login = new JPanel();
        JPanel cadastro = new JPanel();
        //add ao cardsPanel
        cardsPanel.add(home,"Home");//objeto e nome
        cardsPanel.add(login,"Login");
        cardsPanel.add(cadastro,"Cadastro");
        //diferenciando os paineis
        //home
        JButton hButtonLogin = new JButton("Login");
        JButton hButtonCad = new JButton("Cadastro");
        home.add(new JLabel("Página Inicial"));
        home.add(hButtonLogin);
        home.add(hButtonCad);
        //login
        JButton lButtonHome = new JButton("Home");
        JButton lButtonCad = new JButton("Cadastro");
        login.add(new JLabel("Página Login"));
        login.add(lButtonHome);
        login.add(lButtonCad);
        //cadastro
        JButton cButtonHome = new JButton("Home");
        JButton cButtonLogin = new JButton("Login");
        cadastro.add(new JLabel("Página Cadastro"));
        cadastro.add(cButtonHome);
        cadastro.add(cButtonLogin);
        //set finais
        mainPanel.add(cardsPanel,BorderLayout.CENTER);
        this.add(mainPanel);
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(2);//2 fecha a janela e o programa
        this.setVisible(true);
        //criar as Ações 
        hButtonLogin.addActionListener(e->{
            cl.show(cardsPanel,"Login");
        });
        hButtonCad.addActionListener(e->{
            cl.show(cardsPanel,"Cadastro");
        });
        lButtonHome.addActionListener(e->{
            cl.show(cardsPanel,lButtonHome.getText());
        });
        lButtonCad.addActionListener(e->{
            cl.show(cardsPanel,lButtonCad.getText());
        });
        cButtonHome.addActionListener(e->{
            cl.show(cardsPanel,cButtonHome.getText());
        });
        cButtonLogin.addActionListener(e->{
            cl.show(cardsPanel,cButtonLogin.getText());
        });





    }
}
