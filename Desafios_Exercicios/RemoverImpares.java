package Desafios_Exercicios;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoverImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosSemImpares = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra os números pares
                .collect(Collectors.toList()); // Coleta em uma nova lista

        // Exibe a lista resultante no console
        System.out.println("Lista resultante sem números ímpares:");
        numerosSemImpares.forEach(System.out::println);
    }
}
