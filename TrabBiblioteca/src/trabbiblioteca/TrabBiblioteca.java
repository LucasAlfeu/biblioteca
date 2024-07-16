/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabbiblioteca;

import conexao.Conexao;

/**
 *
 * @author Usuario
 */
public class TrabBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexao conn = new Conexao();
        conn.getConexao();
    }
    
}
