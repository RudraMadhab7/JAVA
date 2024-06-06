
class Test{
        void show(){
             System.out.println("lre1");
       }
        void show(int a)
        {
         System.out.println("lg2");
        }
    }
    public class overloading {
        public static void main(String []args){
            Test t=new Test();
            t.show(10);
            t.show();
        }
    }

    