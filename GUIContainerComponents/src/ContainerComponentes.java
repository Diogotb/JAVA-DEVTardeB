import javax.swing.*;

public class ContainerComponentes extends JFrame{
    public ContainerComponentes() {
        super("Janela Principal");
        //adicionar outro container
        JPanel painel1 = new JPanel();
        this.getContentPane().add(painel1);
        //adicionar componentes ao painel1
        painel1.add(new JLabel("Informe um nº"));
        JTextField campo1 = new JTextField("Informe o Valor", 25);
        painel1.add(campo1);
        JButton botao1 = new JButton("Enviar");
        painel1.add(botao1);
        //Usar uma Listener para o botão
        botao1.addActionListener(e->{
            int quant = Integer.parseInt(campo1.getText());
            for (int i = 0; i < quant; i++) {
                painel1.add(new JButton(""+i));
            }
            this.pack();
        });
        //set do frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);


    }
}
