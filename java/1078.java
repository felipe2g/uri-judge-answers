import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeral = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numeral + " = " + i * numeral);
        }
 
    }
 
}
