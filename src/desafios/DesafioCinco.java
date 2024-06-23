package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class DesafioCinco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream()
                .mapToInt(Integer::intValue)
                .filter(n -> n > 5)
                .average();

        // Pode ser impresso com uma verificação

        if(media.isPresent()) {
            System.out.println("Média dos numeros é: " + media.getAsDouble());
        } else {
            System.out.println("Algo deu errado na operação ou valor não existe!");
        }

        // Ou assim jogando um erro se houver algum erro

        System.out.println(media.orElseThrow());
    }
}
