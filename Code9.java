/*Read an integer value, which is the duration in seconds of a certain event in a factory,
and inform it expressed in hours:minutes:seconds.*/

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {    
      
      Scanner input = new Scanner(System.in);
      int N = input.nextInt();
      System.lineSeparator();             

      int hours = N / 3600;  
      N = N - (hours * 3600);// from here the int variable eliminates the decimal place.
     
      
      int minutes = N / 60;
      N = N - (minutes * 60);
      System.lineSeparator();
      System.out.printf("%d:%d:%d\n",hours,minutes,N);
      
      
      input.close();
    }
 
}
