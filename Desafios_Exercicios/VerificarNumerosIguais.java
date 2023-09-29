package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;

public class VerificarNumerosIguais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream()
                .distinct() // Remove números duplicados
                .count() == 1; // Verifica se o número de elementos após a remoção de duplicados é igual a 1

        // Exibe o resultado no console
        if (todosIguais) {
            System.out.println("Todos os números da lista são iguais.");
        } else {
            System.out.println("A lista contém números diferentes.");
        }
    }
}

