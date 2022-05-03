import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberOfCases = sc.nextInt();
        int count = 0;
        int inCount = 0;
        int outCount = 0;


        do {
            int testCase = sc.nextInt();

            if(testCase >= 10 && testCase <= 20) {
                inCount++;
            } else {
                outCount++;
            }

            count++;
        } while (count < numberOfCases);

        System.out.println(inCount + " in");
        System.out.println(outCount + " out");
 
    }
 
}
