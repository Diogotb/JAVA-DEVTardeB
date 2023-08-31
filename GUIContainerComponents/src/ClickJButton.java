import javax.swing.*;

public class ClickJButton extends JFrame{
    //atributo
    int cont=0;
    public ClickJButton() {
        super("Click");
        JPanel painel1 = new JPanel();
        //Criar os Componentes do painel
        JButton botao1 = new JButton("Clique Aqui!");
        painel1.add(botao1);
        JLabel texto1 = new JLabel("nº de Cliques: ");
        painel1.add(texto1);
        botao1.addActionListener(e->{
            cont++;
            texto1.setText("nº de Cliques: "+cont);
            painel1.add(new JButton(""+cont));
            this.pack();
            
        });
        this.getContentPane().add(painel1);
         //set do frame
         this.setDefaultCloseOperation(2);
         this.pack();
         this.setVisible(true);

    }
}
