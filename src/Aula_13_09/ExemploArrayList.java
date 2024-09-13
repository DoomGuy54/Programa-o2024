package Aula_13_09;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        //Precisa ser objeto String, Double, Float, Integer...
        ArrayList<String> lista = new ArrayList<>(10);
        lista.add("A");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        lista.add("G");
        System.out.println(lista);

        lista.add(1,"B");
        System.out.println(lista);
        if(lista.contains("A")){
            System.out.println("O elemento A existe na lista");
        }
        else{
            System.out.println("O elemento A não existe na lista");
        }

        System.out.println("A posição do elemento 'C' na lista "+lista.indexOf("C"));
        lista.add("C");

        System.out.println(lista);
        System.out.println("A última posição de 'C' na lista "+lista.lastIndexOf("C"));

        System.out.println("Removendo o elemento "+lista.remove(1));
        System.out.println("Removendo o elemento "+lista.remove("D"));

        System.out.println("Obtendo o elemento "+lista.get(2));
        System.out.println("O tamanho da lista é "+lista.size());

        lista.clear();
        System.out.println(lista);
        System.out.println("A lista está vaiza? "+lista.isEmpty());

    }
}
