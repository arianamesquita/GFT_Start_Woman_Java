package MetodosJava;

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        int hh;
        int mm;
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o horário atual (hh:mm): ");
        hh = ler.nextInt();
        mm = ler.nextInt();

        if (hh >= 06 && hh < 12) {
            System.out.println("Bom dia!");
        } else if (hh >= 12 && hh < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
