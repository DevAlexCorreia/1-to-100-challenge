/*Read 4 integer values A, B, C and D. 
Then if B is greater than C and D is greater than A and 
if the sum of C and D is greater than the sum of A and B and
if C and D were positives values and if A is even, write the message “Valores aceitos” (Accepted values).
Otherwise, write the message “Valores nao aceitos” (Values not accepted).*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {    
      
      Scanner input = new Scanner(System.in);
      int A = input.nextInt();
      System.lineSeparator();
      int B = input.nextInt();
      System.lineSeparator();
      int C = input.nextInt();
      System.lineSeparator();
      int D = input.nextInt();
      System.lineSeparator();

      if(B>C && D>A && (C+D)>(A+B) && C>0 && D>0 && (A%2==0)){

        System.out.println("Valores aceitos");
      }
      else{
        System.out.println("Valores nao aceitos");
      }
      input.close();
    }
 
}
