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
public class Funcionario {
    private int noRegistro;
    private Pessoa idPessoa;
    private String login;
    private String senha;
    private String cargo;
    private String salario;
    private boolean administrador;
    private boolean treinador;

    public Funcionario() {
    }

    public Funcionario(Pessoa idPessoa, String login, String senha, String cargo, String salario, boolean administrador, boolean treinador) {
        this.idPessoa = idPessoa;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
        this.salario = salario;
        this.administrador = administrador;
        this.treinador = treinador;
    }   

    public int getnoRegistro() {
        return noRegistro;
    }

    public void setnoRegistro(int noRegistro) {
        this.noRegistro = noRegistro;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public boolean isTreinador() {
        return treinador;
    }

    public void setTreinador(boolean treinador) {
        this.treinador = treinador;
    }
}
