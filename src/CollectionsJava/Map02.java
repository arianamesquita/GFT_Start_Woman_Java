package CollectionsJava;

import java.util.*;

public class Map02 {
    public static void main(String[] args) {
        //Dadas as seguintes informações dos meus livros favoritos e seus autores crie um dicionário e ordene
        //este dicionário exibindo (Nome: autor - Nome: livro);

        //Autor: Hawking, Stephen - Livro = nome: Uma Breve História do Templo. páginas 256
        //Autor: Duhigg, Charles - Livro = nome: O Poder do Hábito. páginas 408
        //Autor: Harari, Yuval Noah - Livro = nome: 21 Lições para o Século 21. páginas 432

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Templo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        }};

        System.out.println("--\tOrdem aleatória\t--"); //Hashmap
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem de inserção\t--"); //LinkedHashMap
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do Templo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabética autores\t--"); //TreeMap
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabética nome dos livros\t--"); //TreeSet
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem número de páginas\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPáginas());
    }
}

class Livro {
    private String nome;
    private Integer páginas;

    public Livro(String nome, Integer páginas) {
        this.nome = nome;
        this.páginas = páginas;
    }
    public String getNome() {
        return nome;
    }
    public Integer getPáginas() {
        return páginas;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && páginas.equals(livro.páginas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, páginas);
    }
    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", páginas=" + páginas +
                '}';
    }
}
class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
class ComparatorPagina implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2){
        return l1.getValue().getPáginas().compareTo(l2.getValue().getPáginas());
    }
}
