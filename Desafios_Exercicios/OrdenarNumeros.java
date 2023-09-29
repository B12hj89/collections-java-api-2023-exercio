package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrdenarNumeros {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream()
                .distinct() // Removendo duplicados
                .sorted()   // Ordenando em ordem crescente
                .collect(Collectors.toList());

        // Exibindo no console
        System.out.println("Números em ordem crescente:");
        numerosOrdenados.forEach(System.out::println);





    }

}

