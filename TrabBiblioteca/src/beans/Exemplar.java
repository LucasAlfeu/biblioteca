/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Usuario
 */
public class Exemplar extends Livro {
    public int idExemplar;
    public boolean emprestavel;

    public int getIdExemplar() {
        return idExemplar;
    }

    public boolean isEmprestavel() {
        return emprestavel;
    }

    public void setEmprestavel(boolean emprestavel) {
        this.emprestavel = emprestavel;
    }
    
    
}
