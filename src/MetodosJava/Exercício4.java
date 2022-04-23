package MetodosJava;

public class Exercício4 {
    public static void area (double lado) {
        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void area(double ladoMaior, double ladoMenor, double altura) {
        System.out.println("Área do trapézio: " + ((ladoMaior + ladoMenor)*altura)/2);
    }

}
