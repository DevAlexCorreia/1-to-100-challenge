import java.io.IOException;
import java.util.Scanner; 
public class Code3 {
 
    public static void main(String[] args) throws IOException {
 
      // Who's greater
      Scanner input = new Scanner(System.in);

      int A = input.nextInt();
      System.lineSeparator();
      int B = input.nextInt();
      System.lineSeparator();
      int C = input.nextInt();
      System.lineSeparator();
      
      if(A>B && A>C){// This loop will test if one of these variables are greater then othes
         System.out.printf("%d eh o maior",A);
      }else if(B>A && B>C){
         System.out.printf("%d eh o maior",B);
      }else{
         System.out.printf("%d eh o maior",C);
      }

      

      
      input.close();//closing a input
      
    }
 
}
