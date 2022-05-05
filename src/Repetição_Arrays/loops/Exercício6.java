package Repetição_Arrays.loops;

import java.util.Scanner;

/* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex: 5!=120*/
public class Exercício6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;

        System.out.println("Entrar com número para cálculo fatorial: ");
        int fatorial = ler.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + "!= ");
        for (i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);

    }
}
