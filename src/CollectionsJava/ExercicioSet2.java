package CollectionsJava;

import java.util.*;

public class ExercicioSet2 {
    //Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e ide. Em seguida, crie um
    //conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
    public static void main(String[] args) {

        Set <LinguagensProgramacao>  linguagensProgramacoes = new HashSet<>(){{
            add(new LinguagensProgramacao("Java",1991 , "IntelliJ"));
            add (new LinguagensProgramacao("Javascript", 1995, "Visual Studio"));
            add(new LinguagensProgramacao("Python", 1991, "Jupyter Notebook"));
            add(new LinguagensProgramacao("Cobol", 1959,"OpenCOBOL"));
        }};
        for (LinguagensProgramacao lingProgram : linguagensProgramacoes) System.out.println(lingProgram);

        //Ordene por ordem de inserção;
        System.out.println("\n" + "\t----- \tOrdem de inserção\t -----");
        Set <LinguagensProgramacao>  lingProgram1 = new LinkedHashSet<>(){{
            add(new LinguagensProgramacao("Java",1991 , "IntelliJ"));
            add (new LinguagensProgramacao("Javascript", 1995, "Visual Studio"));
            add(new LinguagensProgramacao("Python", 1991, "Jupyter Notebook"));
            add(new LinguagensProgramacao("Cobol", 1959,"OpenCOBOL"));
        }};
        for (LinguagensProgramacao lingProgram : lingProgram1) System.out.println(lingProgram);

        //Ordene por Ordem Natural (nome);
        System.out.println("\n" + "\t----- \tOrdem natural (Nome)\t -----");
        Set <LinguagensProgramacao> lingProgram2 = new TreeSet<>(linguagensProgramacoes);
        for (LinguagensProgramacao lingProgram : lingProgram2) System.out.println(lingProgram);

        //Ordene por IDE;
        System.out.println("\n" + "\t----- \tOrdem por IDE  \t -----");
        Set <LinguagensProgramacao> lingProgram3 = new TreeSet<>(new ComparatorIDE());
        lingProgram3.addAll(linguagensProgramacoes);
        for (LinguagensProgramacao lingProgram : lingProgram3) System.out.println(lingProgram);

        //Ordene por ano de criacao e nome;
        System.out.println("\n" + "\t----- \tOrdem por ano de criação e nome \t -----");
        Set<LinguagensProgramacao> lingProgram4 = new TreeSet<>(new ComparatorAnoCriacaoENome());
        lingProgram4.addAll(linguagensProgramacoes);
        for (LinguagensProgramacao lingProgram : lingProgram4) System.out.println(lingProgram);

        //Ordene por Nome, ano de criacao e IDE;
        System.out.println("\n" + "\t----- \tOrdem por nome, ano de criação e IDE \t -----");
        Set<LinguagensProgramacao> lingProgram5 = new TreeSet<>(new ComparatorNomeAnodeCriacaoIDE());
        lingProgram5.addAll(linguagensProgramacoes);
        for (LinguagensProgramacao lingProgram : lingProgram5) System.out.println(lingProgram);

    }
}

class LinguagensProgramacao implements Comparable <LinguagensProgramacao>{
    public String nome;
    public Integer anoCriacao;
    public String ide;

    public LinguagensProgramacao(String linguagens, Integer anoCriacao, String ide) {
        this.nome = linguagens;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome = '" + nome + '\'' +
                ", anoCriacao = " + anoCriacao +
                ", ide = '" + ide + '\'' +
                '}'; }


    @Override
    public int compareTo(LinguagensProgramacao linguagensProgramacao) {
        return this.nome.compareTo(linguagensProgramacao.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagensProgramacao that = (LinguagensProgramacao) o;
        return nome.equals(that.nome);}

    @Override
    public int hashCode() { return Objects.hash(nome);
    }

}

class ComparatorIDE implements Comparator<LinguagensProgramacao>{
    @Override
    public int compare(LinguagensProgramacao lf1, LinguagensProgramacao lf2){
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

class ComparatorAnoCriacaoENome implements Comparator <LinguagensProgramacao>{
    @Override
    public int compare(LinguagensProgramacao lf1, LinguagensProgramacao lf2){
        int anoCriacao = Integer.compare(lf1.anoCriacao, lf2.anoCriacao);
        if (anoCriacao != 0) return anoCriacao;
        return lf1.nome.compareToIgnoreCase(lf2.nome);
    }
}

class ComparatorNomeAnodeCriacaoIDE implements Comparator<LinguagensProgramacao>{

    @Override
    public int compare(LinguagensProgramacao lf1, LinguagensProgramacao lf2) {
        int nome = lf1.nome.compareToIgnoreCase(lf2.nome);
        int anoCriacao = Integer.compare(lf1.anoCriacao, lf2.anoCriacao);
        if (nome != 0) return nome;
        if (anoCriacao != 0) return anoCriacao;
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}