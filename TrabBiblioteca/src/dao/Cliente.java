/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import beans.Exemplar;
import beans.Livro;
import beans.Usuario;

/**
 *
 * @author Usuario
 */
public interface Cliente {
    void cadastrarUsuario(Usuario usuario);
    void atualizarDados(Usuario usuario);
    void verificarDisponibilidadeLivro(Exemplar exemplar);
    void localizarLivro(Exemplar exemplar);
    void pedirInclusaoLivro(Livro livro);
    void listarMeusEmprestimos();
    

}
