package Connection;

import java.sql.*;

public class ConnectionFactory {
    // atributos
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USUARIO = "postgres";//nome do ADM do banco
    private static final String SENHA = "postgres";//senha do ADM do banco

    // métodos
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
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
        try {
            if (connection != null && stmt != null) {
                stmt.close();
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    

}
