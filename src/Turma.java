package com.aula.main;

import java.util.ArrayList;

public class Turma
{
    private int num;
    private ArrayList<Aluno> alunos;
    private Aluno delegado, subDelegado;

    public Turma(int num, ArrayList alunos)
    {
        super(numeroAluno, turma, ano, curso);
        this.setNum(num);
        this.alunos = new ArrayList<Alunos>();
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public int getNum()
    {
        return this.num;
    }

    public void addAlunos(String alunos)
    {
        this.alunos.add(alunos);
    }

    public ArrayList<Alunos> getAlunos()
    {
        return this.alunos;
    }

    public void setDelegado(Aluno aluno)
    {
        this.delegado = aluno;
    }

    public Aluno getDelegado()
    {
        return this.delegado;
    }

    public void setSubDelegado(Aluno aluno)
    {
        this.subDelegado = aluno;
    }

    public Aluno getSubDelegado()
    {
        return this.subDelegado;
    }
}
