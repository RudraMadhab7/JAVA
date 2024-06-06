

import java.util.Scanner;

public class add {
    public static int Number(int x,int y){
         int sum=x + y;
         return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
         
        int sum=Number(a,b);
        System.out.println(sum);
    }
}
