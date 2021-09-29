package com.aula.main;

import java.util.ArrayList;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;
    private ArrayList<String> movimentos;
    

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.movimentos = new ArrayList<String>();
    }
    
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public int getNumeroConta() {
        return this.numeroConta;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public String getTitular() {
        return this.titular;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    //AddMovimento()  recebe String e adiciona à array já existente
    public void addMovimento(String movimento) {
        this.movimentos.add(movimento);
    }
    
    
    //getMovimentos() devolve array de strings
    public ArrayList<String> getMovimentos(){
        return this.movimentos;
    }
    
    public void depositarDinheiro(double valor) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.print("Depositou com sucesso " + valor);
    }
    
    
    public void levantarDinheiro(double valor) {
        if (this.getSaldo()> valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Levantou com sucesso " + valor);
        }
        else {
            System.out.println("Não tem dinheiro suficiente");
        }
    }
    
    public void transferir(double valor, ContaBancaria destinatario){
        if (this.getSaldo()> valor) {
            this.setSaldo(this.getSaldo() - valor);
            destinatario.setSaldo(destinatario.getSaldo() + valor);
            System.out.println("Transferiu com sucesso " + valor + 
                    "para a conta do " + destinatario.getTitular());
        }
    }
    
    public void imprimirSaldo() {
        System.out.println(this.getSaldo());
    }
    
    public void imprimirMovimentos() {
        System.out.println("Olá " + this.getTitular() + ", Movimentos:");
        for (int i = 0; i < this.getMovimentos().size(); i++) {               
              System.out.println(this.getMovimentos().get(i)); 
    }
    }
}
