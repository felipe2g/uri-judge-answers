import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int N, numeroColuna;
        float soma = 0, media = 0;
        Scanner sc = new Scanner(System.in);
        float matriz[][] = new float[12][12];
        String option ;
        numeroColuna = sc.nextInt();
        option = sc.next();
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextFloat();
            }
        }
        
        for (int j = 0; j < 12; j++) {
            soma +=  matriz[j][numeroColuna];
        }
        
        media = soma / 12;
        
        if(option.equals("S")){
            System.out.printf("%.1f\n", soma);
        }else if(option.equals("M")){
            System.out.printf("%.1f\n", media);
        }
 
    }
 
}
