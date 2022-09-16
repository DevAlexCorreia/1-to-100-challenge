
      /*In this problem you have to read an integer value and calculate the smallest possible number of banknotes in which the value may be decomposed.
      The possible banknotes are 100, 50, 20, 10, 5, 2 e 1. Print the read value and the list of banknotes*/
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {    
      
      Scanner input = new Scanner(System.in);
      int N = input.nextInt();
      System.lineSeparator();      
      int rest;// it will store the res of the division or the quocient of the division
      System.lineSeparator();
      
      
    System.out.printf("%d nota(s) de R$ 100,00\n", N/100);//divide the first number
    rest = (N%100);// rest gets "N" divided by the higher banknote witch will be decomposed
    System.out.printf("%d nota(s) de R$ 50,00\n", rest/50);// divide  the rest of the decomposition for the secod higher banknote
    rest = (rest%50);// now "rest" gets the quocient of the division
    System.out.printf("%d nota(s) de R$ 20,00\n", rest/20);                                                                                                                        
    rest = (rest%20);
    System.out.printf("%d nota(s) de R$ 10,00\n", rest/10);
    rest = (rest%10);
    System.out.printf("%d nota(s) de R$ 5,00\n", rest/5);
    rest = (rest%5);
    System.out.printf("%d nota(s) de R$ 2,00\n", rest/2);
    rest = (rest%2);
    System.out.printf("%d nota(s) de R$ 1,00\n", rest/1);  
      input.close();
    }
 
}/* 
    */
