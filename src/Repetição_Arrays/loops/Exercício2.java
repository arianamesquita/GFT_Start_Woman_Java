package Repeti��o_Arrays.loops;

// Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inv�lido e
// continue pedindo at� que o usu�rio informe um valor v�lido.

import java.util.Scanner;

public class Exerc�cio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota;

        System.out.println("Entre com a nota: ");
        nota = ler.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Nota inv�lida! Digite novamente!");
            nota = ler.nextInt();
        }

    }
}
