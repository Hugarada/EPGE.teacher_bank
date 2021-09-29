package com.aula.main;

import java.util.ArrayList;

public class Turma{

    private int numeroTurma;
    public String curso;
    public int ano;
    private ArrayList<Aluno> alunos;
    private Aluno delegado;
    private Aluno subDelegado;


    public Turma(int numeroTurma, String curso, int ano){
        this.setNumeroTurma(numeroTurma);
        this.setCurso(curso);
        this.setAno(ano);
        this.alunos = new ArrayList<Aluno>();
    }

    public ArrayList<Aluno> getAlunos(){
        return this.alunos;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setNumeroTurma(int numeroTurma){
        this.numeroTurma = numeroTurma;
    }

    public int getNumeroTurma(){
        return this.numeroTurma;
    }

    public void addAluno(Aluno novoAluno){
        this.alunos.add(novoAluno);
    }

    public void setDelegado(int numAluno){

        for (Aluno aluno : this.getAlunos()) {
            if (aluno.getNumeroAluno() == numAluno){
                this.delegado = aluno;
            }
        }

    }

    public Aluno getDelegado(){
        return this.delegado;
    }

    public Aluno getSubDelegado(){
        return this.subDelegado;
    }


}