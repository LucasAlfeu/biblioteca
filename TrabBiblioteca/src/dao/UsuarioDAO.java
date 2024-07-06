/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Usuario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author a1feu
 */
public class UsuarioDAO {
    private Conexao conexao;
    private Connection conn;
    
    public UsuarioDAO () {
    this.conexao = new Conexao();
    this.conn = this.conexao.getConexao();
}
    
    public void cadstrarUsuario(Usuario usuario){
        String sql = "INSERT INTO usuarios(nome, email, login, senha, matricula, tipoUsuario) VALUES (?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getLogin());
            stmt.setString(4, usuario.getPassword());
            stmt.setString(5, usuario.getMatricula());
            stmt.setString(6, usuario.getTipoDeUsuario());
            
            stmt.execute();
        }catch(Exception e){
            System.out.println("Erro ao inserir Usuario: " + e.getMessage());
        }
    } 
    
    public boolean validaUsuario(String usuario){
        String sql = "SELECT login FROM usuario WHERE login = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, usuario);
            
            ResultSet rs = stmt.executeQuery();
            System.out.println(rs.wasNull());
            return rs.wasNull();
        } catch (Exception e){
            return false;
        }
    }
}
