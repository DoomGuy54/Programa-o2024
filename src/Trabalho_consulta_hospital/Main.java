package Trabalho_consulta_hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        ArrayList<Paciente> pacientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opc;
        System.out.println("Bem-vindo ao sistema de consulta\n");

        do{
            System.out.println("Escolha uma das opções abaixo: \n");
            System.out.println("1 - Para incluir paciente\n");
            System.out.println("2 - Para alterar paciente\n");
            System.out.println("3 - Para realizar atendimento\n");
            System.out.println("4 - Para listar pacientes\n");
            System.out.println("5 - Para mostrar o paciente\n");
            System.out.println("6 - Para apagar o paciente\n");
            System.out.println("7 - Para sair\n");
            System.out.print("Digite sua escolha: ");
            opc = scanner.nextInt();

            switch (opc){
                case 1:
                    System.out.print("Digite o nome do paciente: \n");
                    String nome = scanner.next();
                    System.out.print("Digite o sobrenome do paciente: \n");
                    String sobrenome = scanner.next();
                    Paciente p = new Paciente();
                    p.setNome(nome);
                    p.setSobrenome(sobrenome);
                    p.setDataNascimento(LocalDate.of(2000,02, 20));
                    pacientes.add(p);
                    System.out.println("Paciente adicionado!");
                    break;
                case 2:
                    System.out.println("Digite o nome do usuário: ");
                    nome = scanner.next();
                    boolean encontrado = false;
                    for(int i = 0; i < pacientes.size(); i++){
                        Paciente paciente = pacientes.get(i);
                        if(nome.equals(paciente.getNome())){
                            System.out.println("Usuário encontrado!\n");
                            System.out.println("O nome completo do paciente é: "+paciente.getNome()+" "+paciente.getSobrenome());
                            System.out.println("A data de nascimento do paciente é: "+paciente.getDataNascimento());
                            encontrado = true;

                        }
                    }
                    if(!encontrado){
                        System.out.println("Usuário não encontrado!");
                    }
                    for(int i = 0; i < pacientes.size(); i++){
                        Paciente paciente = pacientes.get(i);
                        System.out.println("[ "+ i + "]" + paciente.getNome());
                    }
                    System.out.println("Digite o número para alterar o nome do pacienete: \n");
                    int opcaoo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o novo nome: \n");
                    String novoNome = scanner.nextLine();
                    System.out.print("Digite o novo sobrenome: \n");
                    String novoSobrenome = scanner.nextLine();

                    Paciente pacientee = pacientes.get(opcaoo);
                    pacientee.setNome(novoNome);
                    pacientee.setSobrenome(novoSobrenome);
                    break;

                case 3:
                    //Realizar atendimento;
                    break;
                case 4:
                    for(int i = 0; i < pacientes.size(); i++){
                        Paciente paciente = pacientes.get(i);
                        System.out.println("O nome completo do paciente é: "+paciente.getNome()+" "+paciente.getSobrenome());
                        System.out.println("A data de nascimento do paciente é: "+paciente.getDataNascimento());
                    }
                    break;
                case 5:
                    //Mostrar paciente;
                    break;
                case 6:
                    for(int i = 0; i < pacientes.size(); i++){
                        Paciente paciente = pacientes.get(i);
                        System.out.println("[ "+ i + "]" + paciente.getNome());
                    }
                    System.out.println("Digite o número do usuário para apagar: \n");
                    int opcao = scanner.nextInt();
                    pacientes.remove(opcao);
                    break;
                case 7:
                    System.out.println("Saindo do sistema\n");
                    break;
                default:
                    System.out.println("Número incorreto");
            }
        }while(opc != 7);






    }
}
