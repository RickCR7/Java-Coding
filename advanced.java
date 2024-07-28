public class advanced {
    public static void main(String[] args) {
        //int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int spaces;
        //     spaces=2*(n-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int spaces;
        //     spaces=2*(n-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }
        // int n=5;//palindromic numbers pyramid
        // for(int i=1;i<=n;i++){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("  ");
        //     }
        //     //first part
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j+" ");
        //     }
        //     //second part
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // int n=5;//diamond
        // //upper part
        // for(int i=1;i<=n;i++){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //lower part
        // for(int i=n;i>=1;i--){
        //     //spaces
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //stars
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        int n=4;//Hollow Rhombus
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{System.out.print(" ");}
            }
            System.out.println();
        }
        
    }
}

