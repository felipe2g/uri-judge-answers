import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int count = 0;

        int initialNumber = sc.nextInt();

        for(int i = 0; count < 6; i++) {
            int numberForCheck = initialNumber + i;
            if(numberForCheck % 2 != 0) {
                System.out.println(numberForCheck);
                count++;
            }
        }
 
    }
 
}
