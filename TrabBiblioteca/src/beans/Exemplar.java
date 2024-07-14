/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Usuario
 */
public class Exemplar {
    private int idexemplares;
    private Livro titulo;
    private Livro autor;
    private String estado;
    private Livro isbn;
    
    public Exemplar(){
        
    }
    
    public Exemplar(Livro titulo, Livro autor, String estado, Livro isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.isbn = isbn;
    }

    public int getIdexemplares() {
        return idexemplares;
    }

    public Livro getTitulo() {
        return titulo;
    }

    public Livro getAutor() {
        return autor;
    }

    public String getEstado() {
        return estado;
    }

    public Livro getIsbn() {
        return isbn;
    }

    public void setIdexemplares(int idexemplares) {
        this.idexemplares = idexemplares;
    }
    
    

    public void setTitulo(Livro titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Livro autor) {
        this.autor = autor;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setIsbn(Livro isbn) {
        this.isbn = isbn;
    }
    
    

    
    
    
    
}
