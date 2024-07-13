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
    private String titulo;
    private String autor;
    private String estado;
    private Livro isbn;
    
    public Exemplar(String titulo, String autor, String estado, Livro isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.isbn = isbn;
    }

    public int getIdexemplares() {
        return idexemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEstado() {
        return estado;
    }

    public Livro getIsbn() {
        return isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setIsbn(Livro isbn) {
        this.isbn = isbn;
    }

    
    
    
    
}
