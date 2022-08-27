//. Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área e o perímetro do retângulo

import java.util.Scanner;

public class Ex02L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" Informe a base do retângulo -> ");
        int base = in.nextInt();
        System.out.print(" Informe a altura do retângulo ->  ");
        int altura = in.nextInt();
        int area = (base * altura);
        int perimetro = ((base + altura) * 2);
        System.out.println("A área do retângulo é de " + area + " , e O perímetro é " + perimetro);

    }

}
