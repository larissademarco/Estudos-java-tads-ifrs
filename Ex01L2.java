// Faça um algoritmo que converta metros para centímetros. Lembrando que 1m = 100cm.

import java.util.Scanner;

public class Ex01L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o valor em metros : ");
        int metros = in.nextInt();
        int conversao = (metros * 100);
        System.out.println("Os " + metros + " metros , é " + conversao + " centímetros!!");

    }
}