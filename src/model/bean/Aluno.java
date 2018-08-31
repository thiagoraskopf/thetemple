/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author alan
 */
public class Aluno {
    private int matricula;
    private Pessoa idPessoa;
    private String login;  
    private String senha;
    private Treinamento idTreino;
    private Funcionario noRegistro;

    public Aluno() {
    }

    public Aluno(Pessoa idPessoa, String login, String senha, Treinamento idTreino, Funcionario noRegistro) {
        this.idPessoa = idPessoa;
        this.login = login;
        this.senha = senha;
        this.idTreino = idTreino;
        this.noRegistro = noRegistro;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Pessoa getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Pessoa idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Treinamento getIdTreino() {
        return idTreino;
    }

    public void setIdTreino(Treinamento idTreino) {
        this.idTreino = idTreino;
    }

    public Funcionario getNoRegistro() {
        return noRegistro;
    }

    public void setNoRegistro(Funcionario noRegistro) {
        this.noRegistro = noRegistro;
    }
}
    



    
    