import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a, b, c, maiorEntreOsDoisPrimeiros, maiorEntreTodos;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        maiorEntreOsDoisPrimeiros = (a+b+Math.abs(a-b))/2;

        maiorEntreTodos = (maiorEntreOsDoisPrimeiros + c + Math.abs(maiorEntreOsDoisPrimeiros - c))/2;

        System.out.println(maiorEntreTodos + " eh o maior");

        sc.close();
    }

}
