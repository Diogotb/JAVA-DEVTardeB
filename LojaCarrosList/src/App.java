import java.util.*;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        List<Carros> listaCarros = new ArrayList<>();
        ArrayList<String> listar = new ArrayList<>();
        boolean aberta = true;
        while (aberta) {
            int acao = Integer
                    .parseInt(JOptionPane.showInputDialog("1-Cadastrar\n2-Listar\n3-Consultar\n4-Apagar\n5-Sair"));
            if (acao == 1) {// cadastrar
                // construir o objetos
                Carros c = new Carros();
                c.setAno(JOptionPane.showInputDialog("Informe o Ano"));
                c.setMarca(JOptionPane.showInputDialog("Informe o Marca"));
                c.setModelo(JOptionPane.showInputDialog("Informe o Modelo"));
                c.setCor(JOptionPane.showInputDialog("Informe o Cor"));
                listaCarros.add(c);
            } else if (acao == 2) {
                for (Carros carros : listaCarros) {
                    listar.add(listaCarros.indexOf(carros) + carros.getMarca() + "," + carros.getModelo() + "\n");
                }
                JOptionPane.showMessageDialog(null, listar);
                listar.clear();
            } else if(acao == 3){
                int indexCarros = Integer.parseInt(JOptionPane.showInputDialog("Informe o Índice do Carro que Deseja Consultar"));
                JOptionPane.showMessageDialog(null, listaCarros.get(indexCarros).getAno()+"\n"
                                                                    +listaCarros.get(indexCarros).getMarca()+"\n"
                                                                    +listaCarros.get(indexCarros).getModelo()+"\n"
                                                                    +listaCarros.get(indexCarros).getCor()+"\n");
            }
            else if(acao == 4){
                int indexCarros = Integer.parseInt(JOptionPane.showInputDialog("Informe o Índice do Carro que Deseja Apagar"));
                listaCarros.remove(indexCarros);
            }else if(acao==5){
                aberta=false;
            }else{
                
            }

        }
    }
    // Cadastrar
    // Consultar
    // Listar
    // Apagar
}
