import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, percentual;

        salario = sc.nextDouble();

        if(salario >= 0 && salario <= 400.00) {
            percentual = 0.15;
        } else if( salario >= 400.01 && salario <= 800.00) {
            percentual = 0.12;
        } else if (salario >= 800.01 && salario <= 1200.00) {
            percentual = 0.10;
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            percentual = 0.07;
        } else {
            percentual = 0.04;
        }

        System.out.printf("Novo salario: %.2f\n", ((salario * percentual) + salario));
        System.out.printf("Reajuste ganho: %.2f\n", salario * percentual);
        System.out.printf("Em percentual: %.0f %%\n", percentual * 100);
 
    }
 
}
