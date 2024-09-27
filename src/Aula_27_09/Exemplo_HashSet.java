package Aula_27_09;

import java.util.HashSet;
public class Exemplo_HashSet {
    public static void main(String[] args) {
        HashSet<String> lista = new HashSet<>();
        lista.add("Arroz");
        lista.add("Feijão");
        lista.add("Tomates");

        //HashSet não adiciona elementos repetidos
        //lista.add("Arroz");
        System.out.println(lista);
    }
}
