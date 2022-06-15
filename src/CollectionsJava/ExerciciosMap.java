package CollectionsJava;

import java.util.*;
import java.lang.String;
import java.util.HashMap;

public class ExerciciosMap {
    //Dada a popula��o estimada de alguns estados do NE brasileiro, fa�a:
    //Estado = PE - Popula��o = 9.616.621
    //Estado = AL - Popula��o = 3.351.543
    //Estado = CE - Popula��o = 9.187.103
    //Estado = RN - Popula��o = 3.534.265

    public static void main(String[] args) {
        //Crie um dicion�rio e relacione os estados e suas popula��es
        Map<String, Integer> todosEstados = new HashMap<>(){{
            put("Pernambuco", 9616621);
            put("Alagoas", 3351543);
            put("Cear�", 9187103);
            put("Rio Grande do Norte", 3534265);
        }};
        System.out.println("Imprima os estados e suas popula��es.");
        System.out.println(todosEstados.toString());

        System.out.println("\nSubstitua a popula��o do estado do RN por 3.534.165:");
        todosEstados.put("Rio Grande do Norte", 3534165);
        System.out.println(todosEstados.toString());

        System.out.println("\nConfira se o estado da Para�ba PB est� no dicion�rio, caso n�o adicione: PB - 4.039.277:");
        System.out.println(todosEstados.containsKey("Para�ba"));
        todosEstados.put("Para�ba", 4039277);
        System.out.println(todosEstados.toString());

        System.out.println("\nExiba a popula��o do PE:");
        for (Map.Entry<String,Integer> populacao: todosEstados.entrySet()){
            if (populacao.getKey().equals("Pernambuco")){
                System.out.println(populacao.getKey() + " - " + populacao.getValue());
            }
        }

        System.out.println("\nExiba todos os estados e suas popula��es na ordem que foram informados.");
        Map<String, Integer> todosEstados1 = new LinkedHashMap<>(){{
            put("Pernambuco", 9616621);
            put("Alagoas", 3351543);
            put("Cear�", 9187103);
            put("Rio Grande do Norte", 3534265);
        }};
        System.out.println(todosEstados1.toString());

        System.out.println("\nExiba os estados e suas popula��es em ordem alfab�tica:");
        Map<String, Integer> todosEstados2 = new TreeMap<>(todosEstados1);
        System.out.println(todosEstados2.toString());

        System.out.println("\nExiba o estado com a menor popula��o e sua quantidade");
        Integer menorPopulacao = Collections.min(todosEstados.values());
        Set<Map.Entry<String, Integer>> entries = todosEstados.entrySet();
        String cidadeMenorPopulacao = " ";
        for (Map.Entry<String, Integer> entry : entries){
            if (entry.getValue().equals(menorPopulacao))
                cidadeMenorPopulacao = entry.getKey();
        }
        System.out.println("Cidade com menor popula��o: " + cidadeMenorPopulacao + " - " + menorPopulacao);

        System.out.println("\nExiba o estado com maior popula��o e sua quantidade:");
        Integer maiorPopulacao = Collections.max(todosEstados.values());
        Set<Map.Entry<String, Integer>> entries1 = todosEstados.entrySet();
        String cidadeMaiorPopulacao = " ";
        for (Map.Entry<String, Integer> entry : entries1){
            if (entry.getValue().equals(maiorPopulacao))
                cidadeMaiorPopulacao = entry.getKey();
        }
        System.out.println("Cidade com maior popula��o: " + cidadeMaiorPopulacao + " - " + maiorPopulacao);

        System.out.println("\nExiba a soma da popula��o desses estados:");
        System.out.println(todosEstados.toString());
        Integer soma = 0;
        Iterator<Integer> iterator = todosEstados.values().iterator();
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma da popula��o dos estados apresentados � de: " + soma);

        System.out.println("\nRemova os estados com popula��o menor que 4.000.000.");
        Iterator<Integer> iterator1 = todosEstados.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() < 4000000){
                iterator1.remove();
            }
        }
        System.out.println(todosEstados.toString());

        System.out.println("\nApague o dicion�rio.");
        todosEstados.clear();

        System.out.println("Confira se o dicion�rio est� vazio: " + todosEstados.isEmpty());
    }
}

/*class Estados {
    private String nome;
    private Double populacao;

    public Estados(String nome, Integer populacao) {
        this.nome = nome;
        this.populacao = Double.valueOf(populacao);
    }

    public String getNome() {
        return nome;
    }

    public Double getPopulacao() {
        return populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estados estados = (Estados) o;
        return nome.equals(estados.nome) && populacao.equals(estados.populacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, populacao);
    }

    @Override
    public String toString() {
        return "Estados{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                '}';
    }
}*/
