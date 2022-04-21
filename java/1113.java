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
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        do {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x < y) {
                System.out.println("Crescente");
            } else if( x > y) {
                System.out.println("Decrescente");
            } else {
                continuar = false;
            }

        } while(continuar==true);
 
    }
 
}
