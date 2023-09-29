package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarIntervalo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int limiteInferior = 5;
        int limiteSuperior = 10;

        List<Integer> numerosNoIntervalo = numeros.stream()
                .filter(numero -> numero >= limiteInferior && numero <= limiteSuperior)
                .collect(Collectors.toList());

        // Exibe o resultado no console
        System.out.println("Números no intervalo [" + limiteInferior + ", " + limiteSuperior + "]:");
        numerosNoIntervalo.forEach(System.out::println);
    }
}

