import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class JFrameComponentes extends JFrame{
    public JFrameComponentes() {
        super("Janela Principal");
        this.setBounds(500, 250, 500, 500);
        //modifiquei o Layout do Frame
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        //adicionar os componentes
        for (int i = 1; i < 50; i++) {
            this.add(new JButton(""+i));
        }
        //set frame
        this.setDefaultCloseOperation(2);
        this.setVisible(true);
    }
}
