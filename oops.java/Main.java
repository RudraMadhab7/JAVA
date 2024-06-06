import java.util.Scanner;

/**
 * InnerMain
 */
class Circle {

    //fields
    int radius;

// constructer
    public Circle(){
        this.radius=0;
    }
    public Circle(int r){
        System.out.println("radius :" + r);
        this.radius=r;
    }

    //methods:
    public double findAraea() {
        return (double) 3.14 * this.radius * this.radius;
    }

    public double findParimeter() {
        return 2 * 3.14 * radius;
    }

}

public class Main {
     public static void main(String[] args) {

        // Scanner scanner=new Scanner(System.in);
        // int radius=0;
        // System.out.println("enter the radius :");
        // radius=scanner.nextInt();


        //  Circle circle1=new Circle();

        //  Circle circle=new Circle(radius);

        //  System.out.println(circle.findAraea());
        //  System.out.println(circle.findParimeter());


    Circle circle1=new Circle(2);
    System.out.println(circle1.findAraea());


    Circle circle2=new Circle(3);
    System.out.println(circle2.findAraea());
   

    
    Circle circle3=new Circle(4);
    System.out.println(circle3.findAraea());



     }
}
