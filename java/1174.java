import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float[] vetor = new float[100];

        for(int i=0;i<100;i++) {
            float numeroDigitado = sc.nextFloat();
            vetor[i] = numeroDigitado;
        }

        for(int j=0;j<100;j++) {
            if(vetor[j] <= 10) {
                System.out.printf("A[%d] = %.1f\n", j, vetor[j]);
            }
        }
 
    }
 
}
