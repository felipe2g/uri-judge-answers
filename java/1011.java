import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio, volume;

        raio = sc.nextDouble();

        volume = (4.0/3.0) * 3.14159 * (Math.pow(raio, 3));

        System.out.printf("VOLUME = %.3f", volume);
        System.out.println();

        sc.close();
    }

}
