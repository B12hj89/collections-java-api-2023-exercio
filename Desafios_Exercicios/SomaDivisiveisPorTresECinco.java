package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;

public class SomaDivisiveisPorTresECinco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDivisiveisPorTresECinco = numeros.stream()
                .filter(numero -> numero % 3 == 0 && numero % 5 == 0) // Filtra os números divisíveis por 3 e 5
                .mapToInt(Integer::intValue) // Converte para IntStream
                .sum(); // Calcula a soma

        // Exibe o resultado no console
        System.out.println("Soma dos números divisíveis por 3 e 5: " + somaDivisiveisPorTresECinco);
    }
}

