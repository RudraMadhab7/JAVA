

abstract class vehicle {
    abstract void start();
}
class car extends vehicle{
 void start(){
    System.out.println("car start with key");
 }
}
class Scooter extends vehicle{
        void start(){
            System.out.println("scoter start with kick");
        }
}
class vechicle{
    public static void main(String []args){
        car c=new car();
        c.start();
        Scooter s= new Scooter();
        s.start();
    }
}
