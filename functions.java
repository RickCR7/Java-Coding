import java.util.Scanner;


public class functions {
   // public static int calculateSum(int a,int b){ //Sum Function
   //  int sum =a+b;
   
   //  return sum;
   // }
   //  public static void main(String[] args) {
   //     int a=10;
   //     int b=25;
   //     System.out.println(calculateSum(a,b));
   //  }
   // public static int multiply(int a,int b){ //Product Function
   //    return a*b;
   // }
   // public static void main(String[] args) {
   //    Scanner sc=new Scanner(System.in);
   //    int a=sc.nextInt();
   //    int b=sc.nextInt();
   //    int result=multiply(a, b);
   //    System.out.println(result);
   // }
   // public static void printFactorial(int n){ //Factorial of a number
   //    if(n<0){
   //       System.out.println("invalid number");
   //       return;
   //    }
   //    int factorial=1;
   //    for(int i=n;i>=1;i--){
   //       factorial=factorial*i;
   //    }
   //    System.out.println(factorial);
   //    return;
   //    }
   //    public static void main(String[] args) {
   //     Scanner sc=new Scanner(System.in);
   //     int n=sc.nextInt();
   //     printFactorial(n);  
   //    }
   // public static void checkEven(int n){ //Even or odd
   //    if(n<=0){
   //       System.out.println("invalid number");
   //    }else if(n%2 == 0){
   //       System.out.println("The number is even");
   //    }else{System.out.println("The number is odd");
   // }
   // return;
   // }
   // public static void main(String[] args) {
   //    Scanner sc=new Scanner(System.in);
   //    int n=sc.nextInt();
   //    checkEven(n);
   // }
   // public static void checkPrime(int n){ //Prime or composite
   //    if(n<=1){
   //       System.out.println("invalid number");
   //    }
   //    for(int i=2;i<=n/2;i++){
   //       if((n%i)==0){
   //          System.out.println("the number is not prime");
   //       }
   //    else{
   //       System.out.println("The number is prime");}
   // }
   // }
   // public static void main(String[] args) {
   //    Scanner sc=new Scanner(System.in);
   //    int n=sc.nextInt();
   //    checkPrime(n);
   // }
   // public static void printTable(int n){ //Printing table of a given number
   //    for(int i=1;i<=10;i++){
   //       System.out.println(n*i);}
   //    return;
   //       }
         
   //       public static void main(String[] args) {
   //          Scanner sc=new Scanner(System.in);
   //          int n=sc.nextInt();
   //          printTable(n);
   //       }
      //   public static void printAverage(int a,int b,int c){ //Average of three variables
      //    int average=(a+b+c)/3;
      //    System.out.println(average);
      //   }
      //   public static void main(String[] args) {
      //    Scanner sc=new Scanner(System.in);
      //    int a=sc.nextInt();
      //    int b=sc.nextInt();
      //    int c=sc.nextInt();
      //    printAverage(a, b, c);
      //   }
      // public static void printSum(int n){
      //    int sum=0;
      //    for(int i=1;i<=n;i++){
      //       if(i%2 != 0){
      //          sum=sum+i;
      //       }
      //       }
      //       System.out.println(sum);
      // }
      // public static void main(String[] args) {
      //    Scanner sc=new Scanner(System.in);
      //    int n=sc.nextInt();
      //    printSum(n);
      // }
      // public static void getGreater(int a,int b){ //Getting greater of two numbers
      //    if(a>b){
      //       System.out.println(a +" is greater than "+ b);
      //    } else {
      //       System.out.println(b +" is greater than "+ a);
      //    }
      // }
      // public static void main(String[] args) {
      //    Scanner sc=new Scanner(System.in);
      //    int a=sc.nextInt();
      //    int b=sc.nextInt();
      //    getGreater(a, b);
      // }
//       public static double getCircumference(float radius){ //Circumference of a circle
//          return 2*3.14*radius;
// }
// public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    float radius=sc.nextFloat();
//    System.out.println( getCircumference(radius));
// }
// public static boolean isElligible(int age){ //Eligibility for vote
//    if(age>18){
//       return true;
//    }
//    return false;
// }
// public static void main(String[] args){
//    Scanner sc=new Scanner(System.in);
//    int age=sc.nextInt();
//    System.out.println(isElligible(age));
// }
// public static void main(String[] args) { //Infinite loop using do-while
//    do{
//       System.out.println("akash");
//    }
//    while(true);
// }
// public static void main(String[] args) { //GCD of two numbers
//    Scanner sc=new Scanner(System.in);
//    int n1=sc.nextInt();
//    int n2=sc.nextInt();
//    while(n1 !=n2){
//       if(n1>n2){
//          n1=n1-n2;
//       }else{
//          n2=n2-n1;
//       }
//    }
//    System.out.println("GCD is : "+n2);
// }
public static void main(String[] args) { //Fibonacci series of n terms
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a=0, b=1;
   System.out.print(a+" ");
   if(n>1){
      //find nth term
      for(int i=2;i<=n;i++){
         System.out.print(b+" ");
         int temp=b;
         b=a+b;
         a=temp;
      }
      System.out.println();
   }
}
}

        
    

