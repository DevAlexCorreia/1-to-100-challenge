import java.io.IOException;
import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
      
      Scanner input = new Scanner(System.in);
      //Sphere calculation
      
      double R = input.nextDouble();//inputing a Radius variable
      final double pi =3.14159;//Constant of pi with 5 places decimal
      double VOLUME = ((4.0/3) * pi * (R*R*R));// formula of Volume 4/3 * pi * R³
          
      
      System.out.printf("VOLUME = %.3f%n", VOLUME);//Printing a value of volume
      input.close();//closing a input
      
    }
 
}
