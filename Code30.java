import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException{
    Scanner input = new Scanner(System.in);
    int n=input.nextInt();
    int []a= new int[n];
    System.lineSeparator();
     String []var=new String[n];
    
    for(int i=0;i<a.length;i++){
      a[i]=input.nextInt();
      if(a[i]>0){//Positivo
        if(a[i]%2==0){//par
            var[i]="EVEN POSITIVE";                   
        }
        else if(a[i]%2==1){
          var[i]="ODD POSITIVE";              
        }
      }
      else if(a[i]<0){
        if(a[i]%2==0){
            var[i]="EVEN NEGATIVE";                   
        }
        else if(a[i]%2!=0){
          var[i]="ODD NEGATIVE";               
        }
      }else if(a[i]==0){
        var[i]="NULL";
      }      
    }
    for(int i=0;i<a.length;i++){//
        System.out.printf("%s%n",var[i]);
    }
    input.close();
  }
}
