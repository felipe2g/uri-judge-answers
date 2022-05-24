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

                double[] vetor = new double[100];

                double numeroInicial = sc.nextDouble();
                vetor[0] = numeroInicial;

                for(int i=1;i<100;i++) {
                    vetor[i] = vetor[i-1] / 2;
                }

                for(int i=0;i<100;i++) {
                    System.out.printf("N[%d] = %.4f\n",i, vetor[i]);
                }
 
    }
 
}
