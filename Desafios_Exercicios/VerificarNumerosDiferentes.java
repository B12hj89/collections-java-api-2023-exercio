package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;

public class VerificarNumerosDiferentes {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDiferentes = numeros.stream()
                .distinct() // Remove números duplicados
                .count() == numeros.size(); // Verifica se o número de elementos após a remoção de duplicados é igual ao tamanho original da lista

        // Exibe o resultado no console
        if (todosDiferentes) {
            System.out.println("Todos os números da lista são diferentes.");
        } else {
            System.out.println("A lista contém números repetidos.");
        }
    }
}
