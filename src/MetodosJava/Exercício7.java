package MetodosJava;

import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o dia da semana: ");
        String diaSemana = ler.next();
        switch (diaSemana) {
            case "segunda" -> {
                System.out.println("Dia 1");
                break;
            }
            case "terça" -> {
                System.out.println("Dia 2");
                break;
            }
            case "quarta" -> {
                System.out.println("Dia 3");
                break;
            }
            case "quinta" -> {
                System.out.println("Dia 4");
                break;
            }
            case "sexta" -> {
                System.out.println("Dia 5");
                break;
            }
            case "sábado" -> {
                System.out.println("Dia 6");
                break;
            }
            case "domingo" -> {
                System.out.println("Dia 7");
                break;
            }
        }
    }
}
