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

        int[] vetor = new int[10];

        for(int i = 0; i <= 9; i++) {
            int numeroDigitado = sc.nextInt();

            if (numeroDigitado <= 0) {
                vetor[i] = 1;
            } else {
                vetor[i] = numeroDigitado;
            }
            System.out.println("X["+i+"] = " + vetor[i]);
        }
 
    }
 
}
