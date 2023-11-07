package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionFactory;
import Model.Carros;

/**
 * CarrosDAO
 */
public class CarrosDAO {

    // atributo
    private Connection connection;

    // construtor
    public CarrosDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    //criar Tabela
    public void criaTabela() {

        String sql = "CREATE TABLE IF NOT EXISTS carros_lojacarros (MARCA VARCHAR(255),MODELO VARCHAR(255),ANO VARCHAR(255),PLACA VARCHAR(255) PRIMARY KEY, VALOR VARCHAR(255))";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // Listar todos os valores cadastrados
    public List<Carros> listarTodos() { // Colocar na tabela
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Carros> carros = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM carros_lojacarros");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Carros carro = new Carros(rs.getString("marca"), rs.getString("modelo"), rs.getString("ano"),
                        rs.getString("placa"), rs.getString("valor"));
                carros.add(carro);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);
        }
        return carros;
    }

    //Cadastrar Carro no banco
    public void cadastrar(String marca, String modelo, String ano, String placa, String valor) {
        PreparedStatement stmt = null;
        String sql = "INSERT INTO carros_lojacarros (marca, modelo, ano, placa, valor) VALUES (?, ?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, marca);
            stmt.setString(2, modelo);
            stmt.setString(3, ano);
            stmt.setString(4, placa);
            stmt.setString(3, valor);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection,stmt);
        }
    }

}