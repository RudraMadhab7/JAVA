import java.util.Scanner;

public class vote {
    public static void main(String args[]){ 
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the age");
        int vote=scanner.nextInt();
        
        if (vote>=18){
           System.out .println("valid for vote");
        }
        else
        {
            System.out.println("not valid for vote");
        }
    }

}
