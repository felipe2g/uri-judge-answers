import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdDias = sc.nextInt();

        double[] vetor = new double[qtdDias];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }

        for(int i = 0; i < vetor.length; i++) {
            int numeroDias=0;
            double restoComida=vetor[i];

            while (restoComida > 1 ) {
                restoComida = restoComida / 2;
                numeroDias++;
            }

            System.out.println(numeroDias + " dias");
        }

    }
 
}
