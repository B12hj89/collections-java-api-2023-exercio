package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparImparesMultiplos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> grupos = numeros.stream()
                .filter(numero -> numero % 2 != 0) // Filtra os números ímpares
                .filter(numero -> numero % 3 == 0 || numero % 5 == 0) // Filtra os múltiplos de 3 ou 5
                .collect(Collectors.partitioningBy(
                        numero -> numero % 3 == 0, // Condicional para o grupo 3
                        Collectors.toList())
                );

        // Exibe o resultado no console
        System.out.println("Valores ímpares múltiplos de 3:");
        grupos.get(true).forEach(System.out::println);

        System.out.println("Valores ímpares múltiplos de 5:");
        grupos.get(false).forEach(System.out::println);
    }
}
