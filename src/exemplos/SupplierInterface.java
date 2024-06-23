package exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
//É comumente usada para criar ou fornecer novos objetos de um determinado tipo.

public class SupplierInterface {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada

//        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // Usar o Supplier para obter uma lista com 5 saudações
//        List<String> listaSaudacoes = Stream.generate(saudacao)
//                .limit(5)
//                .toList();

        // O Collectors aqui é uma outra interface para converter coleções.
        // .collect(Collectors.toList());
        // Uma maneira de simplificá-lo é usando apenas o toList().

        // Esta é a forma verbosa de utilizar o supplier

        List<String> listaSaudacoes = Stream.generate(
                        () -> "Olá, seja bem-vindo(a)!"
                )
                .limit(5)
                .toList();


        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);

        // Esta forma de escrever o sout é referente ao reference method que a prof havia comentado
    }
}
