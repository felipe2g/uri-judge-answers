import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        do {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x == 0 || y == 0) {
                continuar = false;
            } else if(x >= 0 && y >= 0) {
                System.out.println("primeiro");
            } else if(x <= 0 && y>= 0) {
                System.out.println("segundo");
            } else if(x <= 0 && y <= 0) {
                System.out.println("terceiro");
            } else if(x >= 0 && y<= 0) {
                System.out.println("quarto");
            }


        } while(continuar==true);
 
    }
 
}
