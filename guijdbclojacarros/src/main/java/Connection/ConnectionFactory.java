package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    // atributos
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String usuario = "postgres";//nome do ADM do banco
    private static final String senha = "postgres";//senha do ADM do banco

    // métodos
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter conexão com o banco de dados.", e);
        }
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void closeConnection(Connection connection, PreparedStatement stmt) {

        closeConnection(connection);

        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void closeConnection(Connection connection, 
    PreparedStatement stmt, ResultSet rs) {

        closeConnection(connection, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}