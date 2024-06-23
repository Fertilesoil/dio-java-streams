package desafios;

import java.util.Arrays;
import java.util.List;

public class DesafioOito {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosDigitos = numeros.stream()
                .mapToInt(DesafioOito::somarDigitos)
                .sum();

        System.out.println(somaDosDigitos);
    }

    static int somarDigitos(int numero) {
        return String.valueOf(numero).chars()
                .map(Character::getNumericValue)
                .sum();
    }
}
