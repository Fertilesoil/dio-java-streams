package desafios;

import java.util.*;

public class DesafioSete {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoNumeroMaior = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        if(segundoNumeroMaior.isPresent()) {
            System.out.println("Este é o segundo maior número da lista: " + segundoNumeroMaior.get());
        } else {
            System.out.println("Algo deu errado na operação.");
        }
    }
}
