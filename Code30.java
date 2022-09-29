import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{
    Scanner input = new Scanner(System.in);
    int n=input.nextInt();
    int []a= new int[n];
    System.lineSeparator();
    double tam = a.length;
    
    for(int i=0;i<=tam;i++){//For de entrada
      a[i]=input.nextInt();
    }
    for(int i=0;i<=tam;i++){//For de Condições
      if(a[i]>0){//Positivo
        if(a[i]%2==0){//par
          System.out.printf("EVEN POSITIVE");
        
        }
      }
      if(a[i]<0){//negativo
        if(a[i]%2==0){//par
          System.out.printf("EVEN NEGATIVE");
        
        }
      }
      if(a[i]>0){//positivo
        if(a[i]%2==1){//impar
          System.out.printf("ODD POSITIVE");
        
        }
      }
      if(a[i]<0){//negativo
        if(a[i]%2==1){//impar
          System.out.printf("ODD NEGATIVE");
        
        }
      }
      
    }
   
    input.close();
  }
}
