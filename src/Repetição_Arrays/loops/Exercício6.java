package Repeti��o_Arrays.loops;

import java.util.Scanner;

/* Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio. Ex: 5!=120*/
public class Exerc�cio6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;

        System.out.println("Entrar com n�mero para c�lculo fatorial: ");
        int fatorial = ler.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + "!= ");
        for (i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);

    }
}
