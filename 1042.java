import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int menorNumero, numeroMedio, maiorNumero;

        menorNumero = Math.min(a, Math.min(b, c));

        maiorNumero = Math.max(a, Math.max(b, c));

        numeroMedio = a ^ b ^ c ^ menorNumero ^ maiorNumero;

        System.out.println(menorNumero);
        System.out.println(numeroMedio);
        System.out.println(maiorNumero);

        System.out.println("");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}