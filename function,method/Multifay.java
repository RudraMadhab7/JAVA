

import java.util.Scanner;
// public class Multifay {
//     public static int calculate(int x,int y){
//          int sum=x*y;
//         return sum;
//     }
//     public static void main(String args[]){
//          Scanner sc=new Scanner(System.in);
//          int a=sc.nextInt();
//          int b=sc.nextInt();
//         System.out.println("neumber is"+calculate(a,b));
//     }
//Factorail
public class Multifay {
    public static void PrintFactorial(int n){
    
        if(n<0){
            System.out.println("invalid nuber");
            return;
        }
        int factorial=1;
         for(int i=n;i>=1;i--){
             factorial=factorial*n;
         }
            System.out.println(factorial);
         return;
        

    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         PrintFactorial(n);
    }
}

