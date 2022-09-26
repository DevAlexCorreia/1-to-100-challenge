/*Write a program that reads 6 numbers. These numbers will only be positive or negative (disregard null values). Print the total number of positive numbers.*/


import java.io.IOException;
import java.util.Scanner;
public class Main {
 
  public static void main(String[] args) throws IOException {   
      Scanner input = new Scanner(System.in);

  double n1 = input.nextDouble();
  System.lineSeparator();
  double n2 = input.nextDouble();
  System.lineSeparator();
  double n3 = input.nextDouble();
  System.lineSeparator();
  double n4 = input.nextDouble();
  System.lineSeparator();
  double n5 = input.nextDouble();
  System.lineSeparator();
  double n6 = input.nextDouble();
  System.lineSeparator();

  int numbers = 0;
   
      if(n1>0){
        numbers+=1;
      }if(n2>0){
        numbers+=1;
      }if(n3>0){
        numbers++;
      }if(n4>0){
        numbers++;
      }if(n5>0){
        numbers++;
      }if(n6>0){
        numbers++;
      }

    

  System.out.printf("%d valores positivos\n",numbers);
 
  input.close();   
     
  }   
}
