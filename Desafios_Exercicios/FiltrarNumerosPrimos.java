package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarNumerosPrimos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> primos = numeros.stream()
                .filter(FiltrarNumerosPrimos::isPrimo) // Filtra os números primos
                .collect(Collectors.toList()); // Coleta em uma nova lista

        // Exibe o resultado no console
        System.out.println("Números primos na lista: " + primos);
    }

    // Método para verificar se um número é primo
    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

