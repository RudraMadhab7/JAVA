
class Test{
    String show(){
        System.out.println("1");
        return null;
    }
}
class xyz extends Test{
    String show(){
        System.out.println("2");
        return null;
}
}
public class overriding {
 
    public static void main(String []args){
     Test t=new Test();
     t.show();
     xyz x=new xyz();
     x.show();
    }
}
