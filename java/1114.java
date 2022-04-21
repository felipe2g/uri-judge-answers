import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        do {
            int senha = sc.nextInt();

            if(senha == 2002) {
                System.out.println("Acesso Permitido");
                continuar = false;
            } else {
                System.out.println("Senha Invalida");
            }


        } while(continuar==true);
 
    }
 
}
