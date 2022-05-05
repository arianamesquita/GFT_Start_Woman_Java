package Repeti��o_Arrays.loops;

//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10.
//O usu�rio deve informar qual n�mero ele deseja ver a tabuada.
//A sa�da deve ser conforme o exemplo abaixo:
//Tabuada de 5:
//5 x 1 = 5
//5 x 2 = 10 etc.

import java.util.Scanner;

public class Exerc�cio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, i;

        System.out.println("Entre com o n�mero para a tabuada: ");
        numero = ler.nextInt();

        for(i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}
