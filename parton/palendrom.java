public class palendrom {
    public static void main(String args[]){
      int n=121;
      int c=n;
      int s=0;
    while (n>0) {
        int r=n%10;
        s=r+(s*10);
         n=n/10; 
    }
    if(c==s){
        System.out.println("palendrom");
    }
    else{
        System.out.println("not");
    }
    }
}
