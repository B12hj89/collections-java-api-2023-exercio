package Desafios_Exercicios;

import java.util.Arrays;
import java.util.List;

public class VerificarNumeroMaiorQueDez {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean contemNumeroMaiorQueDez = numeros.stream()
                .anyMatch(numero -> numero > 10); // Verifica se algum número é maior que 10

        // Exibe o resultado no console
        if (contemNumeroMaiorQueDez) {
            System.out.println("A lista contém números maiores que 10.");
        } else {
            System.out.println("A lista não contém números maiores que 10.");
        }
    }
}

