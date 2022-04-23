package MetodosJava;

public class Main {
    public static void main(String[] args) {

//        Exercício4.area(3);
//        Exercício4.area(5,5);
//        Exercício4.area(7,8,9);

        double areaQuadrado = Exercício5.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Exercício5.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Exercício5.area(7,8,9);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
