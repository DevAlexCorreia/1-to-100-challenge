import java.io.IOException;
import java.util.Scanner; 
public class Code2 {
 
    public static void main(String[] args) throws IOException {
 /*Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of the square that has side B.
e) the area of the rectangle that has sides A and B.*/
      
      Scanner input = new Scanner(System.in);
       //______________________________________________FORMULA_________________________________________________________
      /*TRIANGULO = BASE*HEIGHT / 2
       *CIRCLE = π * r(radius)²
        TRAPEZIUM = ((B(big base)*b(small base))*h(height))/2
        SQUARE = B(side bases)²
        RECTANGLE = b(base)*h(height)
       */
      //______________________________________________VARIABLE_________________________________________________________
      double A = input.nextDouble();
      System.lineSeparator();
      double B = input.nextDouble();
      System.lineSeparator();
      double C = input.nextDouble();
      System.lineSeparator();
      final double pi = 3.14159;//constant of pi
      //______________________________________________INFORMATION_________________________________________________________
      double TRIANGLE = (A*C)/2;//A will be the base a C the Height
      double CIRCLE= pi*(C*C);// in this case The variable C will be the Radius
      double TRAPEZIUM = ((A+B)*C)/2;// A will be the big Base, B small base and C the Height
      double SQUARE = B*B;// B will be the base and the lenght
      double RECTANGLE = A*B;// A will be the base side, B will be the height side
     
      System.out.printf("TRIANGLE: %.3f%n", TRIANGLE);//Printing with 3 decimal places accuracy
      System.out.printf("CIRCLE: %.3f%n", CIRCLE);      
      System.out.printf("TRAPEZIUM: %.3f%n", TRAPEZIUM);      
      System.out.printf("SQUARE: %.3f%n", SQUARE);     
      System.out.printf("RECTANGLE: %.3f%n", RECTANGLE);

      
      input.close();//closing a input
      
    }
 
}
