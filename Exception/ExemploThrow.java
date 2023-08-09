package Exception;

import javax.swing.JOptionPane;

/**
 * ExemploThrow
 */
public class ExemploThrow {

    public static void main(String[] args) {
        //
        try {
            JOptionPane.showMessageDialog(null, "Welcome to SENAI");
            String login = JOptionPane.showInputDialog("Informe seu Login");
            String dataNascimento = JOptionPane.showInputDialog("Informe sua Data de Nascimento [dd/mm/aa]");
            dataNascimento=dataNascimento.replace("/", "");
            System.out.println(dataNascimento);
            String senha = JOptionPane.showInputDialog("Informe sua Senha de 6 Digitos");
            
            if (senha.length() != 6) {
                throw new Exception("Senha deve ter 6 Digitos");
            }
            if(senha.equals(login)){
                throw new Exception("Senha = login");
            }
            if(!senha.matches(".*[a-z].*") || !senha.matches(".*[A-Z].*") ){
                throw new Exception("falta Letra Lower and Upper");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, e.getMessage(),"senha",0);
        }
    }
}