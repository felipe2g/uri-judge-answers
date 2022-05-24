import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tamanhoVetor = sc.nextInt();
        int menorValor=99999;
        int posicaoMenorValor=0;

        int[] vetor = new int[tamanhoVetor];

        for(int i=0;i<tamanhoVetor;i++) {
            int numeroDigitado = sc.nextInt();
            vetor[i] = numeroDigitado;
        }

        for(int i=0;i<tamanhoVetor;i++) {
            if(vetor[i] < menorValor) {
                menorValor = vetor[i];
                posicaoMenorValor = i;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicaoMenorValor);
 
    }
 
}
