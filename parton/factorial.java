public class factorial {
    public static void main(String args[]){
        int n=4563;

        int fact=0;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
