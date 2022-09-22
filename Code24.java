import java.io.IOException;
import java.util.Scanner;
public class Main {
 
  public static void main(String[] args) throws IOException {   
    Scanner input = new Scanner(System.in);      
    int i,soma=0;
    
    for(i=1;i<=5;i++){
    System.out.println("Digite um número:");
    int n = input.nextInt();
    System.out.printf("%d x 2",n);
    n=n*2;
    System.out.printf(" = %d\n",n);
    soma=soma+n;
    }
    System.out.printf("\nA Soma dos valores é: %d",soma);
    
  }   
}
