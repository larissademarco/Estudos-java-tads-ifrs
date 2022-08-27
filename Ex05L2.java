//Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma mensagem de erro.

import java.util.Scanner;

public class Ex05L2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe dois valores reais -> ");
        float valor1 = in.nextFloat();
        float valor2 = in.nextFloat();
        float divisao = (valor1 / valor2);
        if (valor2!=0) {
        System.out.println("O resultado é " + divisao);}
        while (valor2==0){
        System.out.println("ERRO")}
    
            
        
        }
    }
