package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;

public class VerificarPositivos {


        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

            boolean todosPositivos = numeros.stream()
                    .allMatch(numero -> numero > 0); // Verifica se todos os números são positivos

            // Exibe o resultado no console
            if (todosPositivos) {
                System.out.println("Todos os números são positivos.");
            } else {
                System.out.println("Nem todos os números são positivos.");
            }
        }
    }


