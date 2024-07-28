public class Recursion1{
// public static void printNumbers(int n){ //Print from 1 to 6
//     if(n==6){
//         return;
//     }
//     System.out.println(n);
//     printNumbers(n+1);
// }
// public static void main(String[] args) {
//     printNumbers(1);
// }
// public static void printSum(int n,int sum){ //Sum of first n natural numbers
//     if(n==0){
//         System.out.println(sum);
//         return;
//     }
//     sum += n;
//     printSum(n-1, sum);
// }
// public static void main(String[] args) {
//     printSum(5, 0);
// }
// public static void printFactorial(int n,int fact){ //Factorial of a number n
//     if(n==0){
//         System.out.println(fact);
//         return;
//     }
//     fact *= n;
//     printFactorial(n-1, fact);
// }
// public static void main(String[] args) {
//     printFactorial(5, 1);
// }
// public static void printFibonacci(int a,int b,int n){ //Print Fibonacci sequence till nth term
//     if(n==0){
//         return;
//     }
//     System.out.println(a);
//     printFibonacci(b, a+b, n-1);
// }
// public static void main(String[] args) {
//     printFibonacci(0, 1, 5);
// }
// public static int calPower(int x,int n) { //Print x^n(with stack height n)
//     if(n==0){
//         return 1;
//     }
//     if(x==0){
//         return 0;
//     }
//     int x_=calPower(x, n-1);
//     int xn=x*x_;
//     return xn;
// }
// public static void main(String[] args) {
//     int x=2,n=20;
//     int output=calPower(x, n);
//     System.out.println(output);
// }
// public static int calPower(int x,int n){ //Print x^n(with stack height = logn)
//     if(n==0){
//         return 1;
//     }
    
//     if(n%2 == 0){
//         return calPower(x, n/2)*calPower(x, n/2);
//     }
//     else{
//         return x*calPower(x, n/2)*calPower(x, n/2);
//     }
// }
// public static void main(String[] args) {
//     int x=0,n=1;
//     int output=calPower(x, n);
//     System.out.println(output);
// }
}