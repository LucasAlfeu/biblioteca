/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Exemplar;
import beans.Livro;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class LivroDAO{
    private Conexao conexao;
    private Connection conn;
    
    public LivroDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    
    public void cadastrarLivro(Livro livro){
        String sql = "INSERT INTO livros(titulo,autor,editora,categoria,anolancamento,numeroexemplares) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getEditora());
            stmt.setString(4, livro.getCategoria());
            stmt.setInt(5, livro.getAnoLancamento());
            stmt.setInt(6, livro.getNumeroExemplares());
            stmt.execute();
            
           
        }
        catch (Exception e){
            System.out.println("Erro ao inserir livro: " + e.getMessage());
        }
    }
    
    public void excluirLivro(int id){
        String sql = "DELETE FROM livros WHERE id=?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            
        }
        catch (Exception e){
            System.out.println("Error ao remover livro: "+ e.getMessage());
        }
    }
    
    public Livro getLivro(int id){
        String sql = "SELECT * FROM livros WHERE id=?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Livro livro = new Livro();
            rs.next();
            livro.setId(id);
            livro.setTitulo(rs.getString("titulo"));
            livro.setAutor(rs.getString("autor"));
            livro.setEditora(rs.getString("editora"));
            livro.setCategoria(rs.getString("categoria"));
            livro.setAnoLancamento(rs.getInt("anolancamento"));
            livro.setNumeroExemplares(rs.getInt("numeroexemplares"));
            return livro;
            
        }
        catch (Exception e){
            System.out.println("Erro ao recuperar o livro: "+ e.getMessage());
            return null;
        }
    }
    
    
    public void atualizarLivro(Livro livro) throws NumberFormatException{
        String sql = "UPDATE livros SET titulo=?, autor=?, editora=?, categoria=?, anolancamento=?,numeroexemplares=? WHERE id=? ";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setString(3, livro.getEditora());
            stmt.setString(4, livro.getCategoria());
            stmt.setInt(5, livro.getAnoLancamento());
            stmt.setInt(6, livro.getNumeroExemplares());
            stmt.setInt(7, livro.getId());
            stmt.execute();
            
        }
        catch (NumberFormatException e1){
          String msg = "Valor inválido";
          throw new NumberFormatException(msg);
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Livro> getLivros(String titulo){
        String sql = "SELECT * FROM livros WHERE titulo LIKE ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, titulo+"%");
            ResultSet rs = stmt.executeQuery();
            List<Livro> listaLivros = new ArrayList<>();
            while(rs.next()){
                Livro livro = new Livro();
                livro.setId(rs.getInt("id"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setEditora(rs.getString("editora"));
                livro.setCategoria(rs.getString("categoria"));
                livro.setAnoLancamento(rs.getInt("anolancamento"));
                livro.setNumeroExemplares(rs.getInt("numeroexemplares"));
                listaLivros.add(livro);
            }
            return listaLivros;
        }
        catch (Exception e){
            return null;
        }
    }
    
    
    
    public void adicionarSugestao(Livro livro){
        String sql = "INSERT INTO sugestoes(titulo, autor) VALUES (?,?)";
        try{
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.execute();
        }
        catch(Exception e){
            System.out.println("Erro ao adicionar sugestão: "+ e.getMessage());
        }
    }
    
    
}
