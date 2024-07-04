/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Emprestimo {
    private int idEmprestimo;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private List<Exemplar> lista = new ArrayList<>();
    private String idExemplar;
    private String idUsuario;
    

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public List<Exemplar> getLista() {
        return lista;
    }
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setLista(List<Exemplar> lista) {
        this.lista = lista;
    }
    
    
}
