import java.io.IOException;
import java.util.Scanner; 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
      
      Scanner input = new Scanner(System.in);

      double A = input.nextDouble();
      System.lineSeparator();
      double B = input.nextDouble();
      System.lineSeparator();
      double C = input.nextDouble();
      System.lineSeparator();
      final double pi = 3.14159;

      double TRIANGLE = (A*C)/2;//A will be the base a C the Height
      double CIRCLE= pi*(C*C);// in this case The variable C will be the Radius
      double TRAPEZIUM = ((A+B)*C)/2;// A will be the big Base, B small base and C the Height
      double SQUARE = B*B;// B will be the base and the lenght
      double RECTANGLE = A*B;// A will be the base side, B will be the height side
     
      System.out.printf("TRIANGLE: %.3f%n", TRIANGLE);
      System.out.printf("CIRCLE: %.3f%n", CIRCLE);      
      System.out.printf("TRAPEZIUM: %.3f%n", TRAPEZIUM);      
      System.out.printf("SQUARE: %.3f%n", SQUARE);     
      System.out.printf("RECTANGLE: %.3f%n", RECTANGLE);

      
      input.close();//closing a input
      
    }
 
}