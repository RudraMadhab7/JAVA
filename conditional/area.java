

import java.util.Scanner;

public class area {
    
     public static void main(String args[]){ 
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the radius");
        int radius=scanner.nextInt();
        double area=3.14*radius*radius;
        System.out.println("celsius : "+area);
    }

}


