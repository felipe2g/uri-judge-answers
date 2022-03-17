import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a, b, soma;

        a = sc.nextInt();
        b = sc.nextInt();

        soma = a + b;

        System.out.println("X = " + soma);
        
        sc.close();
    }
 
}
