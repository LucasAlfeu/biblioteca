/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Usuario
 */
public class Conexao {
    
    public Connection getConexao(){
        try {
            Connection conn = DriverManager.getConnection(
                  "jdbc:mysql://localhost:3308/biblio?serverTimezone=UTC", //linha de conexão
                  "root", //usuário do mysql
                  "1234567" //senha do mysql
            
            );
            return conn;
        }
        catch (Exception e){
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}
