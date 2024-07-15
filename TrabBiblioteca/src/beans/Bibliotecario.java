/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author a1feu
 */
public class Bibliotecario extends Usuario {
    public Bibliotecario(){
        
    }
    
    public Bibliotecario(String nome, String email, String login, String password, String matricula, String tipoDeUsuario) {
        super(nome, email, login, password, matricula, tipoDeUsuario);
    }
}
