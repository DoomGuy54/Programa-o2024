package Aula_06_09.exercicios.Sistema_pagamento;

public class FuncionarioHorista extends Funcionario {

    private double salarioBase;
    private double horas;

    public FuncionarioHorista(){
        setNome("Salário horista");
    }

    @Override
    public double calcularSalario() {
        return salarioBase*horas;
    }

    public double getSalarioBase(){
        return salarioBase;
    }
    @Override
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHoras(){
        return horas;
    }
    public void setHoras(double horas) {
        this.horas = horas;
    }
}
