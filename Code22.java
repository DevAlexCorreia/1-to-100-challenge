/*You must make a program that read a float-point number and print 
a message saying in which of following intervals the number belongs: [0,25] (25,50], (50,75], (75,100].
If the read number is less than zero or greather than 100, the program must print the message “Fora de intervalo” 
that means "Out of Interval".

The symbol '(' represents greather than. For example:
[0,25] indicates numbers between 0 and 25.0000, including both.
(25,50] indicates numbers greather than 25 (25.00001) up to 50.0000000.*/
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {    
      
      Scanner input = new Scanner(System.in);
      float A = input.nextFloat();
      System.lineSeparator();
      
      if(A>=0.0000 && A<=25.0000){
        System.out.println("Intervalo (0,25]");
      }else if(A>25.0000 && A<=50.0000){
        System.out.println("Intervalo (25,50]");
      }else if(A>50.0000 && A<=75.0000){
        System.out.println("Intervalo (50,75]");
      }else if(A>75.0000 && A<=100.0000){
        System.out.println("Intervalo (75,100]");
      }else{
        System.out.println("Fora de intervalo");
      }
  
      input.close();
    }
 
}
