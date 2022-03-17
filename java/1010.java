import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo1, codigo2, quantidade1, quantidade2;
        double valor1, valor2, totalAPagar;

        codigo1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valor1 = sc.nextDouble();

        codigo2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor2 = sc.nextDouble();

        totalAPagar = (quantidade1 * valor1) + (quantidade2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", totalAPagar);
        System.out.println();

        sc.close();
    }

}
