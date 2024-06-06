import java.util.Scanner;

public class passFail {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your number");
        int number=scanner.nextInt();
        if(number>=30){
            System.out.println("c grade");
        }
        else if(number>=50 && number>=60){
            System.out.println("D grade");

        }
        else if(number>=60 && number>=70){
            System.out.println("A grade");
        }
        else if(number>=70 && number>=80){
            System.out.println("E grade");
        }
        else if(number>=80 && number>=100){
            System.out.println("o grade");
        }
    }
       
    
}
