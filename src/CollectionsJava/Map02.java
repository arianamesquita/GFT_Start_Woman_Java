package CollectionsJava;

import java.util.*;

public class Map02 {
    public static void main(String[] args) {
        //Dadas as seguintes informa��es dos meus livros favoritos e seus autores crie um dicion�rio e ordene
        //este dicion�rio exibindo (Nome: autor - Nome: livro);

        //Autor: Hawking, Stephen - Livro = nome: Uma Breve Hist�ria do Templo. p�ginas 256
        //Autor: Duhigg, Charles - Livro = nome: O Poder do H�bito. p�ginas 408
        //Autor: Harari, Yuval Noah - Livro = nome: 21 Li��es para o S�culo 21. p�ginas 432

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Hist�ria do Templo", 256));
            put("Duhigg, Charles", new Livro("O Poder do H�bito", 408));
            put("Harari, Yuval Noah", new Livro("21 Li��es para o S�culo 21", 432));
        }};

        System.out.println("--\tOrdem aleat�ria\t--"); //Hashmap
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem de inser��o\t--"); //LinkedHashMap
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Hist�ria do Templo", 256));
            put("Duhigg, Charles", new Livro("O Poder do H�bito", 408));
            put("Harari, Yuval Noah", new Livro("21 Li��es para o S�culo 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfab�tica autores\t--"); //TreeMap
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfab�tica nome dos livros\t--"); //TreeSet
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem n�mero de p�ginas\t--");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getP�ginas());
    }
}

class Livro {
    private String nome;
    private Integer p�ginas;

    public Livro(String nome, Integer p�ginas) {
        this.nome = nome;
        this.p�ginas = p�ginas;
    }
    public String getNome() {
        return nome;
    }
    public Integer getP�ginas() {
        return p�ginas;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && p�ginas.equals(livro.p�ginas);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, p�ginas);
    }
    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", p�ginas=" + p�ginas +
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
        return l1.getValue().getP�ginas().compareTo(l2.getValue().getP�ginas());
    }
}
