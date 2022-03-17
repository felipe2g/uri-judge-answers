import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int distanciaEmKm;
        double totalCombustivelGasto, consumo;

        distanciaEmKm = sc.nextInt();
        totalCombustivelGasto = sc.nextDouble();

        consumo = distanciaEmKm / totalCombustivelGasto;

        System.out.printf("%.3f km/l", consumo);
        System.out.println();

        sc.close();
    }

}
