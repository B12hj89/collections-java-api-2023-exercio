package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;

public class VerificarNumeroNegativo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean contemNegativo = numeros.stream()
                .anyMatch(numero -> numero < 0); // Verifica se algum número é negativo

        // Exibe o resultado no console
        if (contemNegativo) {
            System.out.println("A lista contém pelo menos um número negativo.");
        } else {
            System.out.println("A lista não contém números negativos.");
        }
    }
}
