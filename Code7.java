/*Little John wants to calculate and show the amount of spent fuel liters on a trip, 
using a car that does 12 Km/L. For this, he would like you to help him through a simple program.
To perform the calculation, you have to read spent time (in hours) and the same average speed (km/h). 
In this way, you can get distance and then, calculate how many liters would be needed. 
Show the value with three decimal places after the point.*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {    
      
      Scanner input = new Scanner(System.in);
      
      int spenttime = input.nextInt(); //
      System.lineSeparator();
      int averagespeed = input.nextInt(); //
      System.lineSeparator();
      double careconomy = 12;
      double litters=((spenttime*averagespeed)/careconomy);
      System.lineSeparator();

      System.out.printf("%.3f\n", litters);

      input.close();//closing a input  

    }
 
}
