package CollectionsJava;

import java.util.*;

public class Exerc_Temperatura {
    public static void main(String[] args) {

        // Alterar para incluir o mês no array e conseguir as temperaturas através do loop

        List<Temperatura> TempAnual = new ArrayList<>(){{
            add(new Temperatura("Janeiro", 24));
            add(new Temperatura("Fevereiro", 25));
            add(new Temperatura("Março", 24));
            add(new Temperatura("Abril", 23));
            add(new Temperatura("Maio", 21));
            add(new Temperatura("Junho", 20));
            add(new Temperatura("Julho", 19));
            add(new Temperatura("Agosto", 19));
            add(new Temperatura("Setembro", 20));
            add(new Temperatura("Outubro", 21));
            add(new Temperatura("Novembro", 22));
            add(new Temperatura("Dezembro", 23));
        }};

        int tempTotal = TempAnual.stream().mapToInt(i -> i.getTemperatura()).sum();
        int media = tempTotal/TempAnual.size();

        System.out.println("A média das temperaturas anuais é de: " + media);

        for (int i = 0; i < TempAnual.size(); i++){
            if (TempAnual.get(i).getTemperatura() > media){
                System.out.println(TempAnual.get(i).getMes() + " --> " + TempAnual.get(i).getTemperatura());
            }
        }

/*        List<Integer> temperatura = new ArrayList<>();
        temperatura.add(24);
        temperatura.add(25);
        temperatura.add(24);
        temperatura.add(23);
        temperatura.add(21);
        temperatura.add(20);
        temperatura.add(19);
        temperatura.add(19);
        temperatura.add(20);
        temperatura.add(21);
        temperatura.add(22);
        temperatura.add(23);

        System.out.println("Temperaturas médias anuais: " + temperatura.toString());

        Iterator<Integer> iterator = temperatura.iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
            Integer next = iterator.next();
            soma += next;
        }
        System.out.println("A média anual de temperatura foi de: " + (soma/temperatura.size()));

        System.out.println("Os meses que apresentaram temperatura superior à média anual foram: ");
        int media = (soma/ temperatura.size());
        if (temperatura.get(0) > media) {
            System.out.println("1 - Janeiro - " + temperatura.get(0));
        } if (temperatura.get(1) > media) {
            System.out.println("2 - Fevereiro - " + temperatura.get(1));
        } if (temperatura.get(2) > media) {
            System.out.println("3 - Março - " + temperatura.get(2));
        } if (temperatura.get(3) > media) {
            System.out.println("4 - Abril - " + temperatura.get(3));
        } if (temperatura.get(4) > media) {
            System.out.println("5 - Maio - " + temperatura.get(4));
        } if (temperatura.get(5) > media) {
            System.out.println("6 - Junho - " + temperatura.get(5));
        } if (temperatura.get(6) > media) {
            System.out.println("7 - Julho - " + temperatura.get(6));
        } if (temperatura.get(7) > media) {
            System.out.println("8 - Agosto - " + temperatura.get(7));
        } if (temperatura.get(8) > media) {
            System.out.println("9 - Setembro - " + temperatura.get(8));
        } if (temperatura.get(9) > media) {
            System.out.println("10 - Outubro - " + temperatura.get(9));
        } if (temperatura.get(10) > media) {
            System.out.println("11 - Novembro - " + temperatura.get(10));
        } if (temperatura.get(11) > media) {
            System.out.println("12 - Dezembro - " + temperatura.get(11));
        }*/

    }
}
class Temperatura {
    private String mes;
    private int temperatura;

    public Temperatura (String InputMes, int InputTemperatura) {
        this.mes = InputMes;
        this.temperatura = InputTemperatura;
    }

    public int getTemperatura() {return temperatura; }
    public String getMes() {return mes; }


    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }

}


