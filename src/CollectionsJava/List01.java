package CollectionsJava;

import java.util.*;

public class List01 {
    public static void main(String[] args) {

/*        List notas = new ArrayList(); // antes do Java 5

        ArrayList<Double> notas = new ArrayList<>();
        List <Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        List <Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);

        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List <Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posi��o da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posi��o 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 est� na lista: " + notas.contains(5.0));

/*        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota: notas) System.out.println(nota); */

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a m�dia das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posi��o 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7.0 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

/*        System.out.println("Apague toda a lista.");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista est� vazia: " + notas.isEmpty());*/

        System.out.println("Crie uma lista chamada notas2 " + "e coloque todos os elementos da list ArrayList nessa nova lista: ");
        List <Double> notas2 = new ArrayList<Double>(notas);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da lista sem remov�-la: " + notas2.get(0));

        System.out.println("Mostre a primeira nota da lista removendo-a: " + notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);


    }
}
