/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import beans.Curso;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Usuario
 */
public class CursoDAO {
    private Conexao conexao;
    private Connection conn;
    
    //Vou criar o Construtor da classe. O contrutor é executado
    //automaticamente sempre que um novo objeto é criado.
    
    public CursoDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Curso curso){
        String sql = "INSERT INTO cursos(titulo, categoria, numeropaginas) VALUES"
                + "(?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, curso.getNomecurso());
            stmt.setString(2, curso.getNivel());
            stmt.setInt(3, curso.getDuracao());
            stmt.execute();
        }
        catch(Exception e){
            System.out.println("Erro ao inserir curso: "+ e.getMessage());
        }
    }
    
}
