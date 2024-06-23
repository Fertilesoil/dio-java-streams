package exemplos;

// Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
// É comumente usada para filtrar os elementos do Stream com base em alguma condição.

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Go", "Javascript", "Elixir");

        // Usar o Predicate com expressão lambda para filtrar números pares
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
        List<String> palavrasFiltradas = palavras.stream()
                .filter(maisDeCincoCaracteres)
                .toList();

        // Imprimir a lista de números pares
        palavrasFiltradas.forEach(System.out::println);

        System.out.println();

        palavras.stream().filter(palavra -> palavra.length() > 5).forEach(System.out::println);
    }
}
