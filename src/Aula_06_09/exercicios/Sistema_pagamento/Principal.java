package Aula_06_09.exercicios.Sistema_pagamento;

public class Principal {
    public static void main(String[] args) {

        FuncionarioMensalista fm1 = new FuncionarioMensalista();
        fm1.setSalarioBase(1180);
        System.out.println(fm1);

        FuncionarioComissionado fc1 = new FuncionarioComissionado();
        fc1.setSalarioBase(1180);
        fc1.setHoras(8);
        fc1.setComissao(2);
        System.out.println(fc1);

        FuncionarioHorista fh1 = new FuncionarioHorista();
        fh1.setSalarioBase(1180);
        fh1.setHoras(8);
        System.out.println(fh1);
    }
}
