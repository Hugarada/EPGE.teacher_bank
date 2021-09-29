package com.aula.main;

public class main
{
    public static void main(String[] args)
    {
        Banco CaixaGeraldeDepositos = new Banco("Caixa Geral de Depositos");

        CaixaGeraldeDepositos.addConta(1, "João", 200);
        CaixaGeraldeDepositos.addConta(2, "Manel", 500);

        CaixaGeraldeDepositos.depositar(2, 150);

        CaixaGeraldeDepositos.transferir(2, 1, 50);

    }
}
