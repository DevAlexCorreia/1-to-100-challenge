import java.util.Scanner;
public class Main {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        
        int n =input.nextInt();
        double a = 0;
        int[] x = new int[n+1];
        System.lineSeparator();
        if(n>5 && n<2000){
          for(int i=0;i<x.length;i++){            
                x[i]=i;
            }
        }
        
        for(int i =0;i<x.length;i++){
            a = Math.pow(x[i],2);
            if(x[i]%2==0 && x[i]>0){
        System.out.printf("%d^2 = %.0f%n",x[i],a);
            }
        }

        input.close();
  }
}
