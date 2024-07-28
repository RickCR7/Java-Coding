//solid rectangle 
public class patterns {
    public static void main(String[] args) {
        // int n = 4;
        // int m = 5;
        // for(int i = 0;i < n;i++){
        //     for(int j = 0;j < m;j++){
        //         System.out.print("*");
        //     }System.out.println();
        // }
    //   int n = 4;//Hollow rectangle
    //   int m =5;
    //   for(int i=1;i<=n;i++){
    //     for(int j=1;j<=m;j++){
    //         if(i == 1 || i == n || j == 1 || j == m){
    //             System.out.print("*");
    //         }else{System.out.print(" ");}
    //     }
    //     System.out.println();
    //   } 
    // int n =4;//Half Pyramid
    // for(int i =1;i<=n;i++){
    //     for(int j =1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // int n =4;//Inverted Half Pyramid
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // int n=4;//rotated half pyramid
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(" ");
    //     }for(int j=0;j<=n-i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // int n=5;//Half pyramid with numbers
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }
    // int n =5;//Inverted Half Pyramid with numbers
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }
    // int n = 5;//Floyd's Triangle
    // int number = 1;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(number+" ");
    //         number++;
    //     }
    //     System.out.println();
    // }
    int n=5;//1-0 Half pyramid
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if(j%2 == 0){
                System.out.print(1+" ");
            }else{System.out.print(0+" ");
        }
        }
        System.out.println();
    }
        // int n=5;//SOLID RHOMBUS
        // for(int i=1;i<=n;i++){
        //     //FOR SPACES
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     //FOR STARS
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
