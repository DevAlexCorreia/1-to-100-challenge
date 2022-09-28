/*Make a program that reads five integer values.
Count how many   of these values are even, odd, positive and negative.
Print these information like following example.*/

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
  public static void main(String[] args) throws IOException {   
      Scanner input = new Scanner(System.in);
      
   int []n= new int[5];
   int even = 0,odd=0,pos=0,neg=0;
   
    for(int i=0;i<=4;i++){
      n[i]=input.nextInt();
    }
    System.lineSeparator();
    for(int i=0;i<=4;i++){
      if(n[i]%2==0){
        even++;
      }
      if(n[i]%2!=0){
        odd++;
      }
      if(n[i]>0){
        pos++;
      }
      if(n[i]<0){
        neg++;
      }
    }
    System.out.printf("%d valor(es) par(es)\n",even);
    System.out.printf("%d valor(es) impar(es)\n",odd);
    System.out.printf("%d valor(es) positivo(s)\n",pos);
    System.out.printf("%d valor(es) negativo(s)\n",neg);

  input.close();   
     
  }   
}
