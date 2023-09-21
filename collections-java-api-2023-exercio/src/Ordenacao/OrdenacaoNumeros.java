package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributos

    private List<Integer> numerosList;


    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {

            throw new RuntimeException("A lista está vazia");

        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosDescendente);
            return numerosDescendente;
        } else {

            throw new RuntimeException("A lista está vazia");

        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()){
            System.out.println(this.numerosList);
        } else {
           System.out.println("A lista está vazia");
    }
}

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(13);
        numeros.adicionarNumero(99);
       // Exibindo a Lista de numeros adicionados

        numeros.exibirNumeros();
       // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());
        // Exibindo a lista
        numeros.exibirNumeros();
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a Lista
        numeros.exibirNumeros();

    }

    }



