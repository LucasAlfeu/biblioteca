/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Usuario
 */
public class Professor extends Usuario{
   
   public Professor(){
       
   }

    public Professor(String nome, String email, String login, String password, String idProfessor, String tipoDeUsuario) {
        super(nome, email, login, password, idProfessor, tipoDeUsuario);
    }
   
}
