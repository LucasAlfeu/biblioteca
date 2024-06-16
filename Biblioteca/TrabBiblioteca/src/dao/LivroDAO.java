/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Livro;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class LivroDAO {
    private Conexao conexao;
    private Connection conn;
    
    public LivroDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    
    public void inserir(Livro livro){
        String sql = "INSERT INTO livros(titulo,autor,numeroexemplares,estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getNumeroExemplares());
            stmt.setString(4, livro.getEstado());
            stmt.execute();
        }
        catch (Exception e){
            System.out.println("Erro ao inserir livro: " + e.getMessage());
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
                livro.setNumeroExemplares(rs.getInt("numeroexemplares"));
                livro.setEstado(rs.getString("estado"));
                listaLivros.add(livro);
            }
            return listaLivros;
        }
        catch (Exception e){
            return null;
        }
    }
}
