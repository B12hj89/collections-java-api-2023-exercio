package Desafios_Exercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoMaiorNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct() // Removendo duplicados
                .sorted(Comparator.reverseOrder()) // Ordenando em ordem decrescente
                .skip(1) // Pular o primeiro elemento (o maior)
                .findFirst(); // Encontrar o segundo maior

        // Exibe o resultado no console
        if (segundoMaior.isPresent()) {
            System.out.println("O segundo maior número na lista é: " + segundoMaior.get());
        } else {
            System.out.println("Não há segundo maior número na lista.");
        }
    }
}

