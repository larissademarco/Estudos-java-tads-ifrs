// Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

import java.util.Scanner;

public class Ex03L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número");
        int numero = in.nextInt();
        if (numero < 0)
            System.out.println("Este número é negativo! ");
        else {
            System.out.println("Este número é positivo");
        }
    }
}
