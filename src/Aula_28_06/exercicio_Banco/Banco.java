package Aula_28_06.exercicio_Banco;

import java.util.Scanner;

public class Banco {

    public static String leString(String mensagem){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem+": ");
        return ler.nextLine();

    }

    public static float leFloat(String mensagem){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem+": ");
        return ler.nextFloat();
    }

    public static ContaCorrente acessaCC(ContaCorrente c1){
        //Aqui vai teu código
        return c1;
    }

    public static ContaPoupanca acessaCP(ContaPoupanca c1){
        //Aqui vai o código
        return c1;
    }
    public static void main (String[] args) {
        ContaCorrente[] listaCC = new ContaCorrente[20];

        ContaPoupanca[] listaCP = new ContaPoupanca[20];

        int contaCC = 0;
        int contaCP = 0;
        String opc;

        do{
            System.out.println("Selecione uma opção: ");
            System.out.println("CC - Cadastrar conta corrente");
            System.out.println("CP - Cadastrar conta poupança");
            //Nas opções de acessar existem submenus depositar, sacar, verificar saldo
            System.out.println("AC - Acessar conta corrente");
            System.out.println("AP - Acessar conta poupança");
            System.out.println("E - Sair");
            opc = leString(" ");
        }
        while(!opc.equals("E"));
    }
}
