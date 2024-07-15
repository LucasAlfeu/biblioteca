/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Usuario
 */
public class Aluno extends Usuario{
    
    public Aluno(){
        
    }

    public Aluno(String nome, String email, String login, String password, String matricula, String tipoDeUsuario) {
        super(nome, email, login, password, matricula, tipoDeUsuario);
    }
    
    
}
