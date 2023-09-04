import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout {
    public ExemploFlowLayout() {
        JFrame janela = new JFrame("Janela Principal");
        //mudar o Layout Padrão (Grid)->Flow
        FlowLayout flow = new FlowLayout();
        janela.setLayout(flow); //mudei o layout
        //adicionar componentes no layout
        janela.add(new JLabel("Informe o Valor:"));
    }
}
