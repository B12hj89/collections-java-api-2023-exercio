package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparParesEImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> numerosAgrupados = numeros.stream()
                .collect(Collectors.partitioningBy(numero -> numero % 2 == 0));

        List<Integer> pares = numerosAgrupados.get(true);
        List<Integer> impares = numerosAgrupados.get(false);

        // Exibe os resultados no console
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }
}

