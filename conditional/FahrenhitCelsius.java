

import java.util.Scanner;

public class FahrenhitCelsius {
     public static void main(String args[]){ 
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the Fhrenhit");
        int Fahrenhit=scanner.nextInt();
        float Celsius=((Fahrenhit-32)*5)/9;
        System.out.println("celsius"+Celsius);
    }

}
