package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;

public class SomaNumerosPares {
    private static void sum() {
    }

    public static void main(String[] args, Object sum) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        int somaPares = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra os números pares
                .mapToInt(Integer::intValue)      // Converte para um IntStream
                .sum();



        // Exibe a soma dos números pares no console
        System.out.println("Soma dos números pares: " + somaPares);



    }




}


