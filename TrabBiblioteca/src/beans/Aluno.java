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
    private String matricula;
    
    public Aluno(){
        
    }

    public Aluno(String matricula, String nome, String email, String login, String password) {
        super(nome, email, login, password);
        this.matricula = matricula;
    }
    
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
