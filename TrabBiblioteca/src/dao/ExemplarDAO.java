/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Exemplar;
import beans.Livro;
import java.sql.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;

/**
 *
 * @author Usuario
 */
public class ExemplarDAO {
    private Conexao conexao;
    private Connection conn;
    
    public ExemplarDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    
    
}
