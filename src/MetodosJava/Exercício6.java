package MetodosJava;

import java.util.Scanner;

public class Exerc�cio6 {
    public static void main(String[] args) {
        int mes;
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o n�mero: ");
        mes = ler.nextInt();

        if (mes == 1){
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Mar�o");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } if (mes == 1 || mes == 7 || mes == 12) {
            System.out.println("Voc� est� de f�rias!");
        }
    }
}
