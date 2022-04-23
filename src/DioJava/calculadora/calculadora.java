package DioJava.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b;

        System.out.println("Entre com o primeiro número: ");
        a = ler.nextInt();
        System.out.println("Entre com o segundo número: ");
        b = ler.nextInt();

        int somar = somar(a,b);
        int subtrair = subtrair(a,b);
        int multiplicar = multiplicar(a,b);
        int dividir = dividir(a,b);

        System.out.println("somar: " + somar);
        System.out.println("subtrair: " + subtrair);
        System.out.println("multiplicar: " + multiplicar);
        System.out.println("dividir: " + dividir);
    }

    public static int somar (int a, int b) {
        return a + b;
    }
    public static int subtrair (int a, int b) {
        return a - b;
    }
    public static int multiplicar (int a, int b) {
        return a * b;
    }
    public static int dividir (int a, int b) {
        return a /   b;
    }
}
