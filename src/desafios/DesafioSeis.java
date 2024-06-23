package desafios;

import java.util.Arrays;
import java.util.List;

public class DesafioSeis {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean maiorQueDez = numeros.stream().anyMatch(n -> n > 10);

        if(!maiorQueDez) {
            System.out.println("Não existem números maiores que dez na lista.");
        } else {
            System.out.println("Existem números maiores que dez na lista.");
        }
    }
}
