import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        do {
            int m = sc.nextInt();
            int n = sc.nextInt();

            if ( m <= 0 || n <= 0) {
                continuar = false;
            } else {
                int soma = 0;
                if( m > n ) {
                    for(int i = n; i <= m; i++) {
                        soma += i;
                        System.out.print(i + " ");
                    }
                    System.out.print("Sum=" + soma + "\n");
                } else {
                    for(int i = m; i <= n; i++) {
                        soma += i;
                        System.out.print(i + " ");
                    }

                    System.out.print("Sum=" + soma + "\n");
                }
            }
        } while(continuar==true);
    }
 
}
