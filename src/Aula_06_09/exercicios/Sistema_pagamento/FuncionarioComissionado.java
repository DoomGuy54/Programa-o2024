package Aula_06_09.exercicios.Sistema_pagamento;

public class FuncionarioComissionado extends Funcionario{

    public FuncionarioComissionado(){
        setNome("Salário comissionado");
    }

    private double salarioBase;
    private double horas;
    private double comissao;
    @Override
    public double calcularSalario() {
        return (salarioBase*horas)+comissao;
    }

    @Override
    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
