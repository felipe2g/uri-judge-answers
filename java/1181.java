import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
       	int N, numeroLinha;
        float soma = 0, media = 0;
        Scanner sc = new Scanner(System.in);
        float M[][] = new float[12][12];
        String option ;
        numeroLinha = sc.nextInt();
        option = sc.next();
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = sc.nextFloat();
            }
        }
        
        for (int j = 0; j < 12; j++) {
            soma +=  M[numeroLinha][j];
        }
        
        media = soma / 12;
        
        if(option.equals("S")){
            System.out.printf("%.1f\n", soma);
        }else if(option.equals("M")){
            System.out.printf("%.1f\n", media);
        }
	}
 
}
