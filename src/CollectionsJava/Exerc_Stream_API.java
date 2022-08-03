package CollectionsJava;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Exerc_Stream_API {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

/*        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        numerosAleatorios.stream().forEach(System.out::println);
*//*        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });     *//*
//        numerosAleatorios.stream().forEach (s -> System.out.println(s));
//        numerosAleatorios.forEach (s -> System.out.println(s));
        numerosAleatorios.forEach (System.out::println);*/

/*        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
*//*        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        //não aceita números repetidos - ele imprime em ordem*//*
        Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
        System.out.println(collectSet);*/

/*        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
*//*        numerosAleatorios.stream().map(Integer::parseInt)
                .collect(Collectors.toList()).forEach(System.out::println);*//*
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);*/

/*        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
*//*        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).
                filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i % 2 == 0 && i > 2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);*//*
*//*        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).
                filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);*/

/*        System.out.println("Mostre a média dos números: ");
*//*        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(new DoubleConsumer() {
            @Override
            public void accept(double value) {
                System.out.println(value);
            }
        });*//*
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average()
                .ifPresent(System.out::println);*/

/*        System.out.println("Remova os valores ímpares: ");
*//*        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 != 0) return true;
                return false;
            }
        });
        System.out.println(numerosAleatoriosInteger);*//*
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf(integer -> (integer % 2 != 0));
        System.out.println(numerosAleatoriosInteger);*/

/*        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream().skip(3).forEach(System.out::println);*/

/*        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        long countNumerosUnicos = numerosAleatoriosInteger.stream().distinct().count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam?" + " " + countNumerosUnicos);*/

/*        System.out.println("Mostre o menor valor da lista:");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).min().ifPresent(System.out::println);*/

/*        System.out.println("Mostre o maior valor da lista:");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).max().ifPresent(System.out::println);*/

/*        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        int somaDosPares = numerosAleatoriosInteger.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Pegue apenas os números pares e some: " + somaDosPares);*/

/*        System.out.println("Mostre a lista em ordem numérica: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numerosOrdemNumerica = numerosAleatoriosInteger.stream().sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNumerica);*/

        System.out.println("Agrupe os valores ímpares múltiplos de 3 e de 5:");
        // dica collect(Collector.groupingBy(new Function())
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        Map<Boolean, List<Integer>> collectMultiplosDe3e5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectMultiplosDe3e5);

    }
}
