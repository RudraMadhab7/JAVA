// package parton;

// public class parton {
//     public static void main(String args[]){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     } 
// }

// public class parton {
//         public static void main(String args[]){
//             int n=7;
            

//           for(int i=1;i<n;i++){
//               for(int j=0;j<n-i;j++){
//                 System.out.print(" ");
//               }
//               for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//               }
//               System.out.println();
//           }

//           for(int k=n-1;k>=1;k--){
//              for(int l=1;l<=n-k;l++){
//                  System.out.print(" ");
//             }
//              for(int l=0;l<=2*k-1;l++){
//                 System.out.print("*");
//             }
//             System.out.println();
//           }
//         }
// }
// public class parton {
//       public static void main(String args[]){
//         int n=6;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//               System.out.print("*");
//             }
//             int space=2*(n-i);
//             for(int j=1;j<=space;j++){
//                System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//          System.out.println();
//         }
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//                int space=2*(n-i);
//             for(int j=1;j<space;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.err.println();
//         }
//       }
//     }
    public class parton {
 
        // Function to demonstrate pattern
        public static void printPattern(int n)
        {
            int i, j;
            int num = 1;
     
            // outer loop to handle upper part
            for (i = 1; i <= n; i++) {
                // inner loop to print stars
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
     
                // inner loop to print spaces
                int spaces = 2 * (n - i);
                for (j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
     
                // inner loop to print stars
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
     
                System.out.println();
            }
     
            // outer loop to handle lower part
            for (i = n; i >= 1; i--) {
                // inner loop to print stars
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
     
                // inner loop to print spaces
                int spaces = 2 * (n - i);
                for (j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }
     
                // inner loop to print stars
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
     
                System.out.println();
            }
        }
     
        // Driver Function
        public static void main(String args[])
        {
            int n = 6;
            printPattern(n);
        }
    }