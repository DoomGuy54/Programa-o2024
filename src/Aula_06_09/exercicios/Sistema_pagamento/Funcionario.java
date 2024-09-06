package Aula_06_09.exercicios.Sistema_pagamento;

public abstract class Funcionario {

    private String nome;
    private double salarioBase;

    public abstract double calcularSalario();



    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        String retorno = "Nome: "+nome;
        retorno += "\nO salário salário é de: " +calcularSalario();
        return retorno;
    }
}
