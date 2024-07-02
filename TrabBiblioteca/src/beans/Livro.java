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
    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private String categoria;
    private int anoLancamento;
    private int numeroExemplares;
    private String estado;
    
    public Livro(){
        
    }

    public Livro(String titulo, String autor, String editora, String categoria, int anoLancamento, int numeroExemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.categoria = categoria;
        this.anoLancamento = anoLancamento;
        this.numeroExemplares = numeroExemplares;
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

    public String getCategoria() {
        return categoria;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getNumeroExemplares() {
        return numeroExemplares;
    }

    public String getEstado() {
        return estado;
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

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    
    
    public void setNumeroExemplares(int numeroExemplares) {
        this.numeroExemplares = numeroExemplares;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    
}
