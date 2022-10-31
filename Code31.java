import java.util.Scanner;
public class Main {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        
        int n =input.nextInt();
        int in=0,out=0;
        int[] x = new int[n];

        for(int i=0;i<x.length;i++){
            x[i] = input.nextInt();
        }

        for(int i=0;i<x.length;i++){
            if(x[i]>=10  && x[i]<=20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
        input.close();
        
  }
}
