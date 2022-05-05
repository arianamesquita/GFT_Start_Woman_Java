package Repetição_Arrays.loops;

import java.util.Scanner;

public class Exercício1 {
    //Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo
    //representando a sua idade. Pare o programa inserindo o valor 0 no campo nome.
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        int idade;

        while (true){
            System.out.println("Entre o nome: ");
            nome = ler.next();
            if (nome.equals("0")) break;

            System.out.println("Entre a idade: ");
            idade = ler.nextInt();
        }

        System.out.println("Continua aqui..");


    }
}
