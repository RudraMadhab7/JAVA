//public class parton {
  //  public  static void main(String args[]){
    //    int n=4;
      //  for(int row=1;row<=n;row++){
        //    for(int col=1;col<=row;col++){
         //       System.out.print("*");
           // }
            //System.out.println();
      //  }
    //}
//}
//public class parton {
  //  public static void main(String args[]){
    //      for(int i=0;i<5;i++){
      //      for(int j=0;j<5;j++){
        //        System.out.print("*");
          //  }
            //System.out.println();
          //}
    //}
//}
//public class parton {
  //  public static void main(String args[]){
    //  int n=4;
     //for(int i=n;i>=0;--i){
      //for(int j=0;j<=i;++j){
      //  System.out.print("*");
      //}
      //System.out.println();
     //}
  //}
//}
//public class parton {
   // public static void main(String args[]){
     // int n=4;
     //for(int i=n;i>=1;i--){
      //for(int j=1;j<=i;j++){
        //System.out.print("*");
      //}
      //System.out.println();
     //}
  //}
//}
//public class parton {
  //  public static void main(String args[]){
    //  int n=4;
     //for(int i=1;i<=n;i++){
      //for(int j=1;j<=n-i;j++){
        //System.out.print(" ");
      //}
      //for(int j=1;j<=i;j++){
        //System.out.print("*");
      //}
      //System.out.println();
     //}
  //}
//}

//public class parton{
  //public static void main(String args[]){
    // int n=4;
     //int k=1;
    //for(int i=1;i<=n;i++){
      //for(int j=1;j<=i;j++){
       //System.out.print(j);
      //}
      //System.out.println();
    //}

  //}
//}
//public class parton{
  //public static void main(String args[]){
    // int n=5;
     //for(int i=1;i<=n;i++){
      //for(int j=1;j<n-i+1;j++){
        //  System.out.print(j+" ");
      //}
      //System.out.println();
     //}
  //}
//}
//public class parton{
  //public static void main(String args[]){
    // int n=5;
     //int k=1;
     //for(int i=1;i<=n;i++){
      //for(int j=1;j<n-i+1;j++){
        //  System.out.print(k++);
      //}
      //System.out.println();
     //}
  //}
//}
public class parton{
  public static void main(String args[]){
     int n=5;
     for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        int sum=i+j;
        if(sum%2==0)
          System.out.print("1 ");
        else
          System.out.print("0 ");
      }
      System.out.println();
     }
  }
}
