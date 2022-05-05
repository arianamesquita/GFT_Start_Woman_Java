package Repeti��o_Arrays.arrays;

/* Gere e imprima uma matriz M 4x4 com valores aleat�rios entre 0 e 9. */

import java.util.Random;

public class Exerc�cio4 {
    public static void main(String[] args) {
        Random random = new Random();
        int i, j;

        int [][] M = new int[4][4];

        for(i = 0; i < M.length; i++){
            for (j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M ) {
            for (int coluna : linha ) {
                System.out.println(coluna);
            }
        }
        System.out.println();
    }
}
