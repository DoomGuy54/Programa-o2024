package Aula_27_09;

import java.util.HashMap;
public class Exemplo_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("RS", " Porto Alegre");
        capitais.put("SC ", " Florianopolis");
        capitais.put("MG ", " Belo Horizonte");
        capitais.put("RJ ", " Rio de janeiro");

        //Substitui a chave
        //Precisa ser única
        capitais.put("RS", "Rio Grande");
        System.out.println(capitais);
        for(String estado:capitais.keySet())
            System.out.println(estado+" ");
        for(String cidade:capitais.keySet())
            System.out.println(cidade+" ");

        System.out.println("A lista contém uma chave 'RS'? "+capitais.containsKey("RS"));
        System.out.println("A lista contém 'Porto Alegre'? "+capitais.containsValue("Porto Alegre"));
    }
}
