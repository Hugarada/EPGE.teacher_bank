package com.aula.main;

public class Pessoa
{
    private String nome, morada, CC;
    private int telefone;
    private boolean vacinado;

    public Pessoa(String nome, int telefone, String morada, String CC, boolean vacinado)
    {
        this.setNome(nome);
        this.setTelefone(telefone);
        this.setMorada(morada);
        this.setCC(CC);
        this.setVacinado(vacinado);
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }

    public int getTelefone()
    {
        return this.telefone;
    }

    public void setMorada(String morada)
    {
        this.morada = morada;
    }

    public String getMorada()
    {
        return this.morada;
    }

    public void setCC(String CC)
    {
        this.CC = CC;
    }

    public String getCC()
    {
        return this.CC;
    }

    public void setVacinado(boolean vacinado)
    {
        this.vacinado = vacinado;
    }

    public boolean getVacinado()
    {
        return this.vacinado;
    }
}