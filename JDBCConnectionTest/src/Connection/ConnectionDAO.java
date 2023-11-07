package Connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectionDAO {
    // atributo
    private Connection connection;

    // construtor
    public ConnectionDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    // métodos
    public void criaTabela() {

        String sql = "CREATE TABLE IF NOT EXISTS MINHA_TABELA (ID SERIAL PRIMARY KEY,NOME VARCHAR(255),EMAIL VARCHAR(255))";
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
        String sql = "DROP TABLE Minha_Tabela";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabela apagada com sucesso.");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao apagar tabela.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void inserir(int id, String nome, String email) {
        String sql = "INSERT INTO MINHA_TABELA (ID,NOME, EMAIL) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, nome);
            stmt.setString(3, email);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }
    public void inserir(String nome, String email) {
        String sql = "INSERT INTO MINHA_TABELA (NOME, EMAIL) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void buscarPorId(int id) {
        String sql = "SELECT * FROM MINHA_TABELA WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                int idBuscado = resultSet.getInt("ID");
                String nomeBuscado = resultSet.getString("NOME");
                String emailBuscado = resultSet.getString("EMAIL");
                System.out.println(
                        "o Resultado da busca é id " + idBuscado + " nome " + nomeBuscado + " email " + emailBuscado);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }
    // Apagar um dado da Tabela
    public void apagarID(int id){
        String sql = "DELETE FROM Minha_Tabela WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Dado apagado com sucesso");
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }
    //Atualizar pelo ID
    public void atualizarID(int id, String novoNome, String novoEmail){
        String sql = "UPDATE MINHA_TABELA SET nome = ? , email = ? WHERE ID = ?";
        //UPDATE nomeDaTabela SET (Dados que serão alterados) WHERE (índice da busca)
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, novoNome);
            stmt.setString(2, novoEmail);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }
    //Listar todos os valores cadastrados
    public void listarTodos() { // Colocar na tabela
        ResultSet rs = null;
        String sql = "SELECT * FROM minha_tabela";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                System.out.println("id : "+rs.getInt("id")+
                " nome: "+rs.getString("nome")+
                " email: "+rs.getString("email")); 
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(connection);
        }
    }
}