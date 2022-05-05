package Repetição_Arrays.loops;

//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
//O usuário deve informar qual número ele deseja ver a tabuada.
//A saída deve ser conforme o exemplo abaixo:
//Tabuada de 5:
//5 x 1 = 5
//5 x 2 = 10 etc.

import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, i;

        System.out.println("Entre com o número para a tabuada: ");
        numero = ler.nextInt();

        for(i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}
