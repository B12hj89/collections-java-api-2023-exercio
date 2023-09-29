package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;

public class SomaQuadrados {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaQuadrados = numeros.stream()
                .map(numero -> numero * numero) // Mapeia para o quadrado de cada número
                .mapToInt(Integer::intValue) // Converte para IntStream
                .sum(); // Calcula a soma

        // Exibe o resultado no console
        System.out.println("Soma dos quadrados de todos os números: " + somaQuadrados);
    }
}

