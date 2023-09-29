package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;

public class ProdutoNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long produto = numeros.stream()
                .mapToLong(Integer::longValue) // Converte para LongStream
                .reduce(1, (a, b) -> a * b); // Calcula o produto

        // Exibe o resultado no console
        System.out.println("Produto de todos os números: " + produto);
    }
}

