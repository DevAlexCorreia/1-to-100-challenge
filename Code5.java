//Distance Between Two Points

import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {    
      
      
      Scanner input = new Scanner(System.in);

      double x1 = input.nextDouble(); //
      System.lineSeparator();
      double y1 = input.nextDouble();//
      System.lineSeparator();
      double x2 = input.nextDouble();
      System.lineSeparator();
      double y2 = input.nextDouble();
      System.lineSeparator();

      double dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));//Formula of Distance Between Two Points
      
      /*To know to know the distance between 2 points we need to get the final point less the primal and raise it to the second degree*/
      
      System.out.printf("%.4f\n",dist);   
      input.close();//closing a input  

    }
 
}
