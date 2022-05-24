import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[10];

        int numeroInicial = sc.nextInt();
        vetor[0] = numeroInicial;

        for(int i=1;i<=9;i++) {
            vetor[i] = vetor[i-1] * 2;
        }

        for(int i=0;i<=9;i++) {
            System.out.println("N["+i+"] = " + vetor[i]);
        }
 
    }
 
}
