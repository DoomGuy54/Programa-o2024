package Aula_06_09.exercicios.Sistema_pagamento;

public class FuncionarioMensalista extends Funcionario{

    private double salarioBase;

    public FuncionarioMensalista(){
        setNome("Salário mensalista");
    }
    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
