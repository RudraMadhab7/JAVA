public class Armstrong {
    public static void main(String args[]){
        int n=153;
        int temp=n;
        int arm=0;
        int digits=0;
        int last=0;
        
        while(temp>0){
           temp=temp/10;
            digits++;
        }
        temp=n;
    while(temp>0){
        last=temp%10;
        arm+=(Math.pow(last,digits));
        temp=temp/10;
    }
    if(n==arm){
        System.out.println("Amstrong");
    }
    else{
        System.out.println("not");
    }
    }
}
