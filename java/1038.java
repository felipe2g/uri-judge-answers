import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String [] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double codigo, quantidade;

        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        if (codigo == 1) {
            System.out.printf("Total: R$ %.2f", quantidade * 4);
        }
        if (codigo == 2) {
            System.out.printf("Total: R$ %.2f", quantidade * 4.5);
        }
        if (codigo == 3) {
            System.out.printf("Total: R$ %.2f", quantidade * 5);
        }
        if (codigo == 4) {
            System.out.printf("Total: R$ %.2f", quantidade * 2);
        }
        if (codigo == 5) {
            System.out.printf("Total: R$ %.2f", quantidade * 1.5);
        }

        System.out.println();

    }
 
}
