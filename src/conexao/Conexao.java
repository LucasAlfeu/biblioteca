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
            //tentar estabelecer a conexão
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3308/javaproject?serverTimezone=UTC", //linha de conexão
                    "root", //usuário do mysql
                    "1234567" //senha do mysql
            
            );
            return conn;
        }
        catch (Exception e){
            //se deu erro na hora de conectar
            System.out.println("Erro ao conectar" + e.getMessage());
            return null;
        }
    }
    
}
