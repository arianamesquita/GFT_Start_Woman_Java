package CollectionsJava;

import java.util.*;

public class ExercicioSet {
    // Crie um conjunto contendo as cores do arco-iris e responda as questões abaixo.

    public static void main(String[] args) {

        Set<String> cores1 = new HashSet<>();
            cores1.add("lilás");
            cores1.add("vermelho");
            cores1.add("verde");
            cores1.add("violeta");
            cores1.add("azul");
            cores1.add("amarelo");
            cores1.add("laranja");
            cores1.add("azul-escuro");

        // Exiba todas as cores uma abaixo da outra
        System.out.println("--\tCores arco-íris\t--");
        for (String cores: cores1) System.out.println(cores);

        // A quantidade de cores que o arco-íris tem
        System.out.println("O arco íris tem quantas cores? " + cores1.size());

        // Exiba as cores em ordem alfabética
        System.out.println("--\tCores por Ordem Alfabética\t--");
        Set<String> cores2 = new TreeSet<>(cores1);
        System.out.println(cores2);

        // Exiba as cores na ordem inversa da que foi informada
        Set<String> cores3 = new LinkedHashSet<>(
            Arrays.asList("lilás","vermelho", "verde", "violeta", "azul", "amarelo", "laranja", "azul-escuro"));
        System.out.println("\n" + cores3);
        List<String> coresArcoIrisList = new ArrayList<>(cores3);
        Collections.reverse(coresArcoIrisList);
        System.out.println("Imprimindo na ordem inversa: ");
        System.out.println(coresArcoIrisList + "\n");

        // Exiba todas as cores que começam com a letra "v"
        System.out.println("Exibindo as cores que começam com a letra 'v': ");
        for (String cor: cores1){
            if(cor.startsWith("v")) System.out.println(cor);
        }

        // Remova todas as cores que não começam com a letra "v"
        Iterator<String> iterator2 = cores1.iterator();
        while (iterator2.hasNext()){
            if(!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println("\n" + cores1);

        // Limpe o conjunto
        cores1.clear();
        System.out.println("\n" + cores1);

        // Confira se o conjunto está vazio
        System.out.println("\nO conjunto está vazio? " + cores1.isEmpty());

    }
}

class Cores implements Comparable <Cores>{
    private String cores;

    public Cores(String cores) { this.cores = cores; }

    public String getCores() { return cores; }

    @Override
    public String toString() {
        return "{" +
                "cores='" + cores + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cores cores1 = (Cores) o;
        return cores.equals(cores1.cores);
    }

    @Override
    public int hashCode() { return Objects.hash(cores); }

    @Override
    public int compareTo(Cores cores) {
    return this.getCores().compareTo(cores.getCores());
    }
}

