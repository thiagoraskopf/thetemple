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
public class Treinamento {
    private int id;
    private Exercicio idExercicio;
    private Aluno matrila;
    private String diaDaSemana;

    public Treinamento() {
    }

    public Treinamento(Exercicio idExercicio, Aluno matrila, String diaDaSemana) {
        this.idExercicio = idExercicio;
        this.matrila = matrila;
        this.diaDaSemana = diaDaSemana;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Exercicio getIdExercicio() {
        return idExercicio;
    }

    public void setIdExercicio(Exercicio idExercicio) {
        this.idExercicio = idExercicio;
    }

    public Aluno getMatrila() {
        return matrila;
    }

    public void setMatrila(Aluno matrila) {
        this.matrila = matrila;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }
}