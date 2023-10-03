import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
       // Executa a aplicação na thread de despacho de eventos Swing
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TodoListApp().run();
            }
        }); 
    }
}
