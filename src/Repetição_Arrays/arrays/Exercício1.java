package Repeti��o_Arrays.arrays;

/* Crie um vetor de 6 n�meros inteiros e mostre-os na ordem inversa. */

public class Exerc�cio1 {
    public static void main(String[] args) {

        int[] vetor = {-6, -5, 17, 30, 7, 3};
        int i = 0;

/*        System.out.println("Vetor: ");
        while (i < (vetor.length - 1)){
            System.out.println(vetor[i] + " ");
            i++;
        }*/

        System.out.println("Vetor: ");
        for (i = (vetor.length -1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }
    }
}
