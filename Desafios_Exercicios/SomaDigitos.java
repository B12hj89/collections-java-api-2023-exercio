package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;

public class SomaDigitos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream()
                .mapToInt(SomaDigitos::somarDigitos) // Mapeia para a soma dos dígitos de cada número
                .sum(); // Calcula a soma

        // Exibe o resultado no console
        System.out.println("Soma dos dígitos de todos os números: " + somaDigitos);
    }

    // Método para somar os dígitos de um número
    private static int somarDigitos(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10; // Obtém o dígito da unidade e adiciona à soma
            numero /= 10; // Remove o dígito da unidade
        }
        return soma;
    }
}
