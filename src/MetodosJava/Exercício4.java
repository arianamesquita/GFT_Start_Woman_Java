package MetodosJava;

public class Exerc�cio4 {
    public static void area (double lado) {
        System.out.println("�rea do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("�rea do ret�ngulo: " + lado1 * lado2);
    }

    public static void area(double ladoMaior, double ladoMenor, double altura) {
        System.out.println("�rea do trap�zio: " + ((ladoMaior + ladoMenor)*altura)/2);
    }

}
