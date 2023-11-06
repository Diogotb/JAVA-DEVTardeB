package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Connection.ConnectionFactory;
import Model.Carros;

public class CarrosDAO {
    // codigos para o banco de dados
    // atributo
    private Connection connection;
    private List<Carros> carros;

    // construtor
    public CarrosDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    // métodos
    public void criaTabela() {

        String sql = "CREATE TABLE IF NOT EXISTS CARROS_LOJACARROS (MARCA VARCHAR(255),MODELO VARCHAR(255),ANO VARCHAR(255), PLACA VARCHAR(255) PRIMARY KEY, VALOR VARCHAR(255))";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void apagarTabela() {
        String sql = "DROP TABLE CARRO_LOJACARROS";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabela apagada com sucesso.");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao apagar tabela.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void inserir(String marca, String modelo, String ano, String placa, String valor) {
        String sql = "INSERT INTO CARROS_LOJACARROS (MARCA,MODELO,ANO,PLACA,VALOR) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, marca);
            stmt.setString(2, modelo);
            stmt.setString(3, ano);
            stmt.setString(4, placa);
            stmt.setString(5, valor);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
            ConnectionFactory.closeConnection(connection);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public List<Carros> read() { // Colocar na tabela
        ResultSet rs = null;
        carros = new ArrayList<>();
        String sql = "SELECT * FROM CARROS_LOJACARROS";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.executeUpdate(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Carros carro = new Carros(rs.getString("marca"), rs.getString("modelo"), rs.getString("ano"),
                        rs.getString("placa"), rs.getString("valor"));
                carros.add(carro);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
        return carros;
    }

    public void delete(String placa) {
        String sql = "DELETE FROM CARROS_LOJACARROS WHERE placa = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, placa);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(connection);
        }

    }

}
