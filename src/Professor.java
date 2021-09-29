package com.aula.main;

import com.aula.main.Funcionario;

import java.util.Random;
import java.util.random;

public class Professor extends Funcionario
{
    private String cargo;

    public Professor(String nome, int telefone, String morada, String CC, boolean vacinado, int numeroFuncionario, int salario, boolean ativo, String cargo)
    {
        super(nome, telefone, morada, CC, vacinado, numeroFuncionario, salario, ativo);
        this.setCargo(cargo);
    }

    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

    public String getCargo()
    {
        return this.cargo;
    }

    public void elegerDelegado(Turma turma, int[] numsAlunos)
    {
        int aluno = mostFrequent(numsAlunos, numsAlunos.length);
        turma.setDelegado(aluno);
    }

    // https://www.geeksforgeeks.org/frequent-element-array/
    private static int mostFrequent(int arr[], int n)
    {

        // Sort the array
        Arrays.sort(arr);

        // find the max frequency using linear
        // traversal
        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[n - 1];
        }

        return res;
    }
}