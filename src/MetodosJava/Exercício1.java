package MetodosJava;

import java.util.Scanner;

public class Exerc�cio1 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner ler = new Scanner(System.in);

        System.out.print("Entre com o primeiro n�mero: ");
        num1 = ler.nextInt();
        System.out.println("Entre com o segundo n�mero: ");
        num2 = ler.nextInt();

        int somar = num1 + num2;
        System.out.println("Soma: " + somar);
        int subtrair = num1 - num2;
        System.out.println("Subtrair: " + subtrair);
        int multiplicar = num1 * num2;
        System.out.println("Multiplicar: " + multiplicar);
        int divisao = num1 / num2;
        System.out.println("Dividir: " + divisao);

    }
}
