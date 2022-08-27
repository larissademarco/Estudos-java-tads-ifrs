import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int n,med,c=0,s = 0 ;
        String resp;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Digite um número ");
            n = in.nextInt();
            s+=n;
            c++;
            med = s/c;
        
            System.out.println("Quer continuar ? S para sim/ N para não ");
            resp = in.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é " + med );

    }
}
