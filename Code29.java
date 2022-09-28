import java.io.IOException;
import java.util.Scanner;
public class Main {
 
  public static void main(String[] args) throws IOException {   
    Scanner input = new Scanner(System.in);
    int []n=new int[2];
    int i=0,sum=0,min=0,max=0;
    for(i=0;i<=1;i++){
      n[i]=input.nextInt();
    }
    
     if(n[0]<n[1]){
      min=n[0];
      max=n[1];
     }else{
      min=n[1];
      max=n[0];
     }
      for(i=(min+1);i<max;i++){
        if(i % 2 != 0){
          sum += i;
         }
      }
      System.out.printf("%d%n",sum);
      
      
    input.close();
  }      
}  
