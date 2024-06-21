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
   private String idProfessor;
   
   public Professor(){
       
   }

    public Professor(String idProfessor, String nome, String email, String login, String password) {
        super(nome, email, login, password);
        this.idProfessor = idProfessor;
    }
   
   
    public String getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(String idProfessor) {
        this.idProfessor = idProfessor;
    }
   
   
}
