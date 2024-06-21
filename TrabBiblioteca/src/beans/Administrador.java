/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Usuario
 */
public class Administrador extends Usuario{
    private String idAdm;
    
    public Administrador(){
        
    }

    public Administrador(String nome, String email, String login, String password) {
        super(nome, email, login, password);
    }
    

    public String getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(String idAdm) {
        this.idAdm = idAdm;
    }
    
    
}
