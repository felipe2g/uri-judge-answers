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

        int[] vetor = new int[20];

        for(int i=0;i<20;i++) {
            int numeroDigitado = sc.nextInt();
            vetor[i] = numeroDigitado;
        }

        for(int j=0;j<10;j++) {
            int posicaoUltimo = vetor.length - (j + 1);
            int numeroA = vetor[j];
            int numeroB = vetor[posicaoUltimo];

            vetor[j] = numeroB;
            vetor[posicaoUltimo] = numeroA;
        }

        for(int x=0;x<20;x++) {
            System.out.printf("N[%d] = %d\n", x, vetor[x]);
        }
 
    }
 
}
