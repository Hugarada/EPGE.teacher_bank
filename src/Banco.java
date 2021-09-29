package com.aula.main;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<ContaBancaria> contas;

    public Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<ContaBancaria>();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public ArrayList<ContaBancaria> getContas(){
        return this.contas;
    }

    public void addConta(int numeroConta, String titular, double saldo){
        ContaBancaria conta = new ContaBancaria(numeroConta, titular, saldo);
        this.contas.add(conta);
    }

    public void depositar(int numeroConta, double valor){
        this.getConta(numeroConta).depositarDinheiro(valor);
    }

    public void levantar(int numeroConta, double valor){
        this.getConta(numeroConta).levantarDinheiro(valor);
    }

    public ContaBancaria getConta(int numeroConta){
        for (ContaBancaria conta : this.getContas()){
            if (conta.getNumeroConta() == numeroConta)
            return conta;
        }
        return null;

    }
    public void transferir(int numeroCRemetente, int numeroCDestinatario, double valor){

        ContaBancaria remetente;
        ContaBancaria destinatario;

        remetente = this.getConta(numeroCRemetente);
        destinatario = this.getConta(numeroCDestinatario);

        remetente.transferir(valor, destinatario);
    }

}