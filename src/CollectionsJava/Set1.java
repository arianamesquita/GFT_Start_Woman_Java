package CollectionsJava;

import java.util.*;

public class Set1 {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());
        // Sa�da [0.0, 8.5, 3.6, 5.0, 9.3, 7.0]
        // nota 7 n�o repetiu, ordem aleat�ria.

//        System.out.println("Exiba a posi��o da nota 5.0: ");
        // N�o � poss�vel fazer busca de acordo com posi��o utilizando Set, n�o tem posi��o definida.
//        System.out.println("Adicione na lista a nota 8.0 na posi��o 4: ");
        // N�o � poss�vel trabalhar com posi��o definida com o Set.
//        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        // N�o � poss�vel substituir utilizando o Set.
        System.out.println("Confira se a nota 5.0 est� no conjunto: " + notas.contains(5d));
//        System.out.println("Exiba a terceira nota adicionada: ");
        // N�o � poss�vel no m�todo Set.
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Imprima a m�dia das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

//        System.out.println("Remova a nota da posi��o 0: ");
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println("Confira se o conjunto est� vazio: " + notas.isEmpty());
        notas2.clear();
        System.out.println("Confira se o conjunto 2 est� vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 est� vazio: " + notas3.isEmpty());

    }
}
