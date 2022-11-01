import java.util.Scanner;
public class Main {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        
        int n =input.nextInt();
        int[] x = new int[10000];
        
        for(int i=0;i<x.length;i++){           
            x[i] = i;           
        }
        for(int i=0;i<x.length;i++){
            if(x[i]%n==2){
            System.out.println(x[i]);
            }
        }

        input.close();
  }
}
