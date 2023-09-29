package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MediaNumerosMaioresQueCinco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream()
                .filter(numero -> numero > 5) // Filtra os números maiores que 5
                .mapToDouble(Integer::doubleValue) // Converte para DoubleStream
                .average(); // Calcula a média

        // Exibe o resultado no console
        if (media.isPresent()) {
            System.out.println("Média dos números maiores que 5: " + media.getAsDouble());
        } else {
            System.out.println("Não há números maiores que 5 na lista.");
        }
    }
}

