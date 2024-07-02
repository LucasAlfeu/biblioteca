/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import beans.Livro;

/**
 *
 * @author Usuario
 */
public interface Servidor {
    void emprestimoLivro();
    void devolucaoDeLivro();
    void verificarLivrosEmprestados();
    void localizarLivros();
    void cadastrarLivro(Livro livro);
    void excluirLivro();
    void atualizarLivro();
    void listaDeEspera();
    void cadastrarUsuario();
    void atualizarDadosDoUsuario();
    void verificarDisponibilidadeLivro();
}
