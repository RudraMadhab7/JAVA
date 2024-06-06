public class prime {
    public static void main(String[] args) {
        int n=10;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.print("primre nnumber");
        }
        else{
            System.out.println("not primenumber");
        }
    }
}
