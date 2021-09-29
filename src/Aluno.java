package com.aula.main;

public class Aluno extends Pessoa
{

    private int numeroAluno;
    private int turma;
    private int ano;
    private String curso;

    public Aluno(String nome, int telefone, String morada, String CC, boolean vacinado, 
        int numeroAluno, int turma, int ano, String Curso) {
        super(nome, telefone, morada, CC, vacinado);
        
    }

    public void setNumeroAluno(int numeroAluno){
        this.numeroAluno = numeroAluno;
    }
 
    public int getNumeroAluno(){
        return this.numeroAluno;
    }

    public void setTurma(int turma){
        this.turma = turma;
    }

    public int getTurma(){
        return this.turma;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return this.ano;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getCurso(){
        return this.curso;
    }
    
}