package exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Os métodos forEach recebem um consumer, por isso esta função lambda é passada para dentro do forEach, esta
        // função é do tipo um Consumer
        numeros.forEach(imprimirNumeroPar);

        //Esta é apenas uma forma de implementar, vamos ver a forma mais curta e implementação

        numeros.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (integer % 2 == 0) {
                    System.out.println();
                    System.out.println(integer);
                }
            }
        });

        // Esta é a versão lambda, a versão enxuta. Lembra bastante o javascript né?
        numeros.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }
}
