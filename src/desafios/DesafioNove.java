package desafios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioNove {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean saoUnicos = new HashSet<>(numeros)
                .size() == numeros.size();

        if(!saoUnicos) {
            System.out.println("Existem números repetidos na lista.");
        } else {
            System.out.println("Não existem números repetidos na lista.");
        }
    }
}

