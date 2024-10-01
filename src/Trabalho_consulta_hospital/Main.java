package Trabalho_consulta_hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Paciente> paciente = new ArrayList<>();
        paciente.add(new Paciente("Ana", "Silva"));
        paciente.add(new Paciente("Jonas", "Rinker"));
        paciente.add(new Paciente("Nicolas", "Bernardo"));
        System.out.println(paciente);

        //System.out.println(data);
        //LocalDate dataNascimento = LocalDate.of(1995, 03, 03);
        //System.out.println(dataNascimento);


    }
}
