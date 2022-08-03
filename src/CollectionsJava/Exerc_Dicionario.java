package CollectionsJava;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

import java.util.*;

public class Exerc_Dicionario {
    public static void main(String[] args) {
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(2, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};

        // ordem aleatória
        System.out.println("--\tOrdem aleatória\t--"); //Hashmap
        for (Map.Entry<Integer, Contato> agenda2 : agenda.entrySet())
            System.out.println(agenda2.getKey() + " - " + agenda2.getValue().getNome());

        // ordem inserção
        System.out.println("--\tOrdem inserção\t--"); //LinkedHashMap
        Map<Integer, Contato> agenda3 = new LinkedHashMap<>() {{
            put(1, new Contato("Simba", 2222));
            put(2, new Contato("Cami", 5555));
            put(3, new Contato("Jon", 1111));
        }};
        for (Map.Entry<Integer, Contato> agenda4 : agenda3.entrySet())
            System.out.println(agenda4.getKey() + " - " + agenda4.getValue().getNome());

        // ordem id
        System.out.println("--\tOrdem id\t--"); //TreeMap
        Map<Integer, Contato> agenda5 = new TreeMap<>(agenda);
        for (Map.Entry<Integer, Contato> agenda6 : agenda5.entrySet())
            System.out.println(agenda6.getKey() + " - " + agenda6.getValue().getNome());

        System.out.println("--\tOrdem número telefone\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new ComparatorOrdemNumerica());
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }

        System.out.println("--\tOrdem nome contato\t--");
        //precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new ComparatorOrdemNomeContato());
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}
class Contato implements Comparable <Contato> {
    public String nome;
    public Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato agenda = (Contato) o;
        return nome.equals(agenda.nome) && agenda.equals(agenda.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", número=" + numero +
                '}';
    }

    @Override
    public int compareTo (Contato Contato){
        return this.nome.compareTo(Contato.nome);
    }

}
class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}
