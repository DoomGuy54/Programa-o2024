package Aula_13_09;

public class Main {
    public static void main(String[] args) {
        Lista<String> l1 = new Lista<>(6); //Imprime apenas 5 elementos
        l1.adiciona("A");
        //l1.adiciona("B");
        l1.adiciona("C");
        l1.adiciona("D");
        l1.adiciona("E");
        l1.adiciona("F");
        System.out.println(l1);
        System.out.println("Obtendo o elemento da posição 2: "+l1.obterElemento(2));

        try {
            System.out.println("Obtendo o elemento da posição 10: " + l1.obterElemento(10));
        }
        catch (IllegalArgumentException e){
            System.out.println("O elemento 10 não existe na lista");
        }
        System.out.println("Qual a posição do elemento 'A' na lista? "+l1.posicaoDe("A"));
        System.out.println("Qual a posição do elemento 'a' na lista? "+l1.posicaoDe("a"));
        l1.adiciona(1, "B");
        System.out.println(l1);
        System.out.println("Removendo o elemento da posição 3: ");
        l1.remove(2);
        System.out.println(l1);
    }
}
