/* Creating a program who can measure a total spent of fuel, and how economic is a car*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {    
      
      
      Scanner input = new Scanner(System.in);

      int X = input.nextInt(); //Total distance in Km
      System.lineSeparator();
      double Y = input.nextDouble();//spent fuel total
      System.lineSeparator();
      double Z = X/Y;
      System.lineSeparator();
      
      System.out.printf("%.3f km/l\n",Z);   
      input.close();//closing a input  

    }
 
}
