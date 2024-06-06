
    class Animal{
        void eat(){
            System.out.println("eating");
        }

    }
    class dog extends Animal{
        void barking()
    {
        System.out.println("barking");
    }

    }
    public class SingleInheritance {
    public static void main(String args[]){
        dog d=new dog();
         d.barking();
         d.eat();
    }
}
