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
import javax.swing.JOptionPane;

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
    
    public String validaUsuario(String usuario){
        String sql = "SELECT login FROM usuarios WHERE login = ?";
        String aux = "";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, usuario);
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                aux = rs.getString("login");
            }
            /**if(usuario.equals(aux)){
                return "Usuario existente";
            } else {
                return usuario;
            }*/
            return aux;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return "diferente";
        }
    }
    
    public Usuario procuraUsuario(String usuario, String senha){
        String sql = "SELECT * FROM usuarios WHERE login = ? AND senha = ?";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            Usuario user = new Usuario();
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                user.setNome(rs.getString("nome"));
                user.setEmail(rs.getString("email"));
                user.setLogin(usuario);
                user.setPassword(senha);
                user.setMatricula(rs.getString("matricula"));
                user.setTipoDeUsuario(rs.getString("tipoUsuario"));
                
            }
            
            return user;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
        public Usuario procuraUsuario(String identificacao){
            String sql = "SELECT * FROM usuarios WHERE matricula = ?";

            try {
                PreparedStatement stmt = this.conn.prepareStatement(sql);

                stmt.setString(1, identificacao);

                Usuario user = new Usuario();

                ResultSet rs = stmt.executeQuery();
                while(rs.next()){
                    user.setNome(rs.getString("nome"));
                    user.setEmail(rs.getString("email"));
                    user.setLogin(rs.getString("login"));
                    user.setPassword(rs.getString("senha"));
                    user.setMatricula(rs.getString("matricula"));
                    user.setTipoDeUsuario(rs.getString("tipoUsuario"));

                }

                return user;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }

        }
        
        public boolean deletarUsuario(String identificacao, String login){
            String sql = "DELETE FROM usuarios WHERE matricula = ? AND login = ?";
            
            try {
                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setString(1,identificacao);
                stmt.setString(2,login);
                
                if (!System.getProperty("matricula").equals(identificacao)){
                    stmt.execute();
                    return true;
                } else {
                    return false;
                }               
                
            } catch (Exception e){
                System.out.println(e.getMessage());
                return false;
            }
        }
        
        public void atualizarDados(Usuario usuario){
            String sql = "UPDATE usuarios SET nome = ?, email = ?, login = ?, senha = ? WHERE matricula = ?";
                
            try {
                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setString(1, usuario.getNome());
                stmt.setString(2, usuario.getEmail());
                stmt.setString(3, usuario.getLogin());
                stmt.setString(4, usuario.getPassword());
                stmt.setString(5, System.getProperty("matricula"));
                
                stmt.execute();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
}
