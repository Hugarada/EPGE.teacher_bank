package com.aula.main;

public class Funcionario extends Pessoa
{
    private int numeroFuncionario, salario;
    private boolean ativo;

    public Funcionario(String nome, int telefone, String morada, String CC, boolean vacinado, int numeroFuncionario, int salario, boolean ativo)
    {
        super(nome, telefone, morada, CC, vacinado);
        
        this.setNumeroFuncionario(numeroFuncionario);
        this.setSalario(salario);
        this.setAtivo(ativo);
    }
    
    public void setNumeroFuncionario(int numeroFuncionario)
    {
        this.numeroFuncionario = numeroFuncionario;
    }
 
    public int getNumeroFuncionario()
    {
        return this.numeroFuncionario;
    }

    public void setSalario(int salario)
    {
        this.salario = salario;
    }

    public int getsalario() {
        return this.salario;
    }

    public void setAtivo(boolean ativo)
    {
        this.ativo = ativo;
    }

    public boolean getAtivo()
    {
        return this.ativo;
    }
}