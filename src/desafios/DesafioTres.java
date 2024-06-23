package desafios;

import java.util.Arrays;
import java.util.List;

public class DesafioTres {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, -3, 9, 10, 5, 4, 3);

        boolean saoPositivos = numeros.stream().allMatch(n -> n > 0);

        if(!saoPositivos) {
            System.out.println("Não, nem todos os números são positivos.");
        } else {
            System.out.println("Todos os números da lista são positivos.");
        }
    }
}
