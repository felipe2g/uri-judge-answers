import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int employeeNumber, workedHours;
        double pricePerHour, salary;

        employeeNumber = sc.nextInt();
        workedHours = sc.nextInt();
        pricePerHour = sc.nextDouble();

        salary = workedHours * pricePerHour;

        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f", salary);
        System.out.println();

        sc.close();
    }

}
