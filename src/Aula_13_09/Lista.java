package Aula_13_09;

public class Lista<T> {

    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade){
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    //Construtor que me permite omitir o tamanho da lista
    //e construa uma lista com 10 elementos
    public Lista(){
        elementos = (T[]) new Object[10];
        tamanho = 0;
    }

    //Método que pesquisa e diz se existe ou não
    public boolean contem (T elemento){
        for(int i=0; i<tamanho; i++)
            if(elementos[i].equals(elemento))
                return true;
        return false;
    }

    //Método que remove o elemento pelo elemento



    public void adiciona(T elemento){
        aumentaCapacidade();
        elementos[tamanho++] = elemento;
    }

    public void adiciona(int posicao, T elemento){
        if(posicao<0 || posicao>tamanho){
            throw new IllegalArgumentException("Posição inválida");
        }
        aumentaCapacidade();
        for(int i = tamanho-1; i>=posicao; i--)
            elementos[i+1] = elementos[i];
        elementos[posicao] = elemento;
        tamanho++;
    }

    public int posicaoDe(T elemento){
        for(int i=0; i<tamanho;i++)
            if(elementos[i].equals(elemento))
                return i;
        return -1;
    }

    public T obterElemento(int posicao){
        if(posicao<0 || posicao>tamanho){
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }

    public T remove (int posicao){
        if(posicao<0 || posicao>tamanho){
            throw new IllegalArgumentException("Posição inválida");
        }
        T elemento = elementos[posicao];
        for(int i=posicao; i<tamanho-1;i++)
            elementos[i] = elementos[i+1];
        tamanho--;
        return elemento;
    }

    private void aumentaCapacidade(){
        if(tamanho == elementos.length) {
            T[] aux = (T[]) new Object[tamanho * 2];
            for(int i=0; i< elementos.length; i++)
                aux[i] = elementos[i];
            elementos = aux;
        }
    }

    //Se vazio => [] Se possuir elementos => [1, 2, 3, 4]
    @Override
    public String toString(){
        String resultado = "[";
        if(tamanho>0){
            for(int i=0; i<tamanho-1;i++){
                resultado +=elementos[i]+", ";
            }
            resultado+=elementos[tamanho-1];
        }
        return resultado+"]";
    }
}
