public class Opps {
    public static void main(String args[]){
        Pen p1=new Pen();
        //p1.setColor("bluee");
        System.out.println(p1.setColor("read"));
    }
    
}
class Pen{
    String color;
    int tip;
    public String setColor(String newColor){
       return color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
    class Student{
        String name;
        int age;
        float percentage;
        void calcPercentage(int phy,int chem,int math){
          percentage=(phy+chem+math);  
        }
    }
}