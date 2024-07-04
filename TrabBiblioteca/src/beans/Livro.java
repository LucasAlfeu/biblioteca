/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Usuario
 */
public class Livro {
    protected int id;
    protected String titulo;
    protected String autor;
    protected int numeroExemplares;
    protected String estado;
    protected String editora;
    
    public Livro(){
        
    }

    public Livro(int id, String titulo, String autor, int numeroExemplares, String estado, String editora) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroExemplares = numeroExemplares;
        this.estado = estado;
        this.editora = editora;
    }   
    

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroExemplares() {
        return numeroExemplares;
    }

    public String getEstado() {
        return estado;
    }

    public void setNumeroExemplares(int numeroExemplares) {
        this.numeroExemplares = numeroExemplares;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    
}
