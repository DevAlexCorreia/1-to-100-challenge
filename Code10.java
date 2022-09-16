/*Read an integer value corresponding to a person's age (in days) and print it in years, months and days,
 followed by its respective message “ano(s)”, “mes(es)”, “dia(s)”.

Note: only to facilitate the calculation, consider the whole year with 365 days and 30 days every month. 
In the cases of test there will never be a situation that allows 12 months and some days, like 360, 363 or 364. 
This is just an exercise for the purpose of testing simple mathematical reasoning. */
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {    
      
      Scanner input = new Scanner(System.in);
      int N = input.nextInt();// N= Person's age(in days)
      System.lineSeparator();             
      // We need to print it in years, months and days
      int years=N/365 ;
      N=N-(years*365);

      int months=N/30;
      N=N-(months*30);
      System.lineSeparator(); 
      System.out.printf("%d ano(s)\n",years);
      System.out.printf("%d mes(es)\n",months);
      System.out.printf("%d dia(s)\n",N);
      input.close();
    }
 
}
