/*Read three point floating values (A, B and C) and verify if is possible to make a triangle with them. 
If it is possible, calculate the perimeter of the triangle and print the message:
Perimetro = XX.X
If it is not possible, calculate the area of the trapezium which basis A and B and C as height, and print the message:
Area = XX.X*/


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

        if((A+B)>C && (A+C)>B && (B+C)>A){
                double perimeter = A+B+C;
                System.out.printf("Perimetro = %.1f\n", perimeter);
        }else{
                double Atrapezium = 0.5*(A+B)*C;
                System.out.printf("Area = %.1f\n", Atrapezium);
        }

    input.close();
    }    
    
}
