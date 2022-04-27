package MetodosJava;

import java.util.Scanner;

public class Exercício8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        String num1 = ler.next();

        switch (num1) {
            case "1", "2", "3" -> {
                System.out.println("Certo");
                break;
            }
            case "4" -> {
                System.out.println("Errado");
                break;
            }
            case "5" -> {
                System.out.println("Talvez");
                break;
            }
            default -> {
                System.out.println("Valor Indefinido");
                break;
            }
        }
    }
}
