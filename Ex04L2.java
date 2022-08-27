//Escreva um programa que faça a leitura de dois valores inteiros e descubra qual deles é o maior, imprimindo na resposta o nome da variável e o seu valor.

import java.util.Scanner;

public class Ex04L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe dois valores inteiros ");
        int valor1 = in.nextInt();
        int valor2 = in.nextInt();
        if (valor1 > valor2)
            System.out.println("O maior número é " + valor1 + " que está na variavel valor1 ");
        else {
            System.out.println("O maior número é " + valor2 + " que está na variável valor2 ");
        }
    }
}
