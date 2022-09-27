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
  double media = 0,total=0,aux=0;
  int numbers = 0;
   
      if(n1>0){
        numbers+=1;
        aux+=n1;
        media++;        
        }if(n2>0){
        numbers+=1;
        aux+=n2;
        media++;        
      }if(n3>0){
        numbers++;
        aux+=n3;
        media++;       
      }if(n4>0){
        numbers++;
        aux+=n4;
        media++;
      }if(n5>0){
        numbers++;
        aux+=n5;
        media++;
      }if(n6>0){
        numbers++;
        aux+=n6;
        media++;
      }

    total=aux/media;

  System.out.printf("%d valores positivos\n",numbers);
  System.out.printf("%.1f%n",total);
 
  input.close();   
     
  }   
}
