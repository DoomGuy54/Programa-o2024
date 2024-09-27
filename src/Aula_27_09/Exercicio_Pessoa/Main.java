package Aula_27_09.Exercicio_Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa ("Ana", "Silva"));
        Pessoa p1 = new Pessoa("Jonas", "Rinker");
        lista.add(p1);
        System.out.println(lista);
    }
}
