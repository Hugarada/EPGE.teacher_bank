package com.aula.main;

public class testing
{

    public static void main(String[] args){

                                //nome, telefone, morada, CC, vacinado, numeroFuncionario, salario, ativo, cargo
        Professor joao = new Professor("João", 910000000, "Rua da liberdade", "30161390", false, 1, 650, true, "OET");
        

        System.out.println(joao.getNome());

        Secretario manuel = new Secretario("Manuel", 912342423, "Rua bla bla", "301612732", true, 2, 700, true, "Secretario Chefe");
        Turma tgpsi1 = manuel.criarTurma(1, "TGPSI", 1);

        manuel.adicionarAluno(tgpsi1, "Hugo", 91242342, "Rua de portugal", "3023423523", false, 1, 1, 1, "TGPSI");

        System.out.println(tgpsi1.getAlunos().get(0).getNome());

        int votacao[] = {1, 5, 2, 1, 3, 2, 1};
        joao.elegerDelegado(tgpsi1, votacao);

        
    }

}