import java.io.IOException;
import java.util.Scanner;
public class Main {
 
  public static void main(String[] args) throws IOException {   
      Scanner input = new Scanner(System.in);
    
double[] n = new double[6];
  double media = 0,total=0,aux=0;
  int numbers = 0;
   
  for(int i=0;i<n.length;i++){
    n[i] = input.nextDouble();
  }
  for(int i=0;i<n.length;i++){
    if(n[i]>0){
      numbers++;
      aux++;
      media++;
    }
  }
    total=aux/media;

  System.out.printf("%d valores positivos\n",numbers);
  System.out.printf("%.1f%n",total);
 
  input.close();   
  }   
}
