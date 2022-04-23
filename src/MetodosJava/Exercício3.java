package MetodosJava;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        float valorSolicitado;
        double valorFinal;
        float qtddParcelas;
        double Parcelas;
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o valor que deseja solicitar: ");
        valorSolicitado = ler.nextFloat();
        System.out.println("Entre com a quantidade de parcelas que deseja: ");
        qtddParcelas = ler.nextFloat();

        if (valorSolicitado < 5000) {
            valorFinal = valorSolicitado + (0.1 * valorSolicitado);
        } if (valorSolicitado > 5000 && valorSolicitado < 10000) {
            valorFinal = valorSolicitado + (0.2 * valorSolicitado);
        } else {
            valorFinal = valorSolicitado + (0.3 * valorSolicitado);
        }

        Parcelas = valorFinal / qtddParcelas;

        System.out.println("O valor final é de: R$ " + valorFinal + "\nSerão " + qtddParcelas + " parcelas de: R$ " + Parcelas);

    }
}
