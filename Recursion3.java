import java.util.ArrayList;
public class Recursion3 {
    // public static void printPermutation(String str,int idx,String perm){ //Print all permutations of a string
    //     if(str.length()==0){
    //         System.out.println(perm);
    //         return;
    //     }
    //     for(int i=0;i<str.length();i++){
    //         char currChar=str.charAt(i);
    //         String newString=str.substring(0, i)+str.substring(i+1);
    //         printPermutation(newString, idx+1, perm+currChar);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str="abc";
    //     printPermutation(str, 0, "");
    // }
    // public static int countPaths(int i,int j,int m,int n){ //C0unt pathmaze
    //     if(i==m-1 || j==n-1){
    //         return 1;
    //     }
    //     return countPaths(i+1, j, m, n)+countPaths(i, j+1, m, n);
    // }
    // public static void main(String[] args) {
    //     int m=2,n=4;
    //     System.out.println(countPaths(0, 0, m, n));
    // }
    // public static int placeTiles(int n,int m){ //Tilling problem
    //     if(n<m){
    //         return 1;
    //     } else if(n==m){
    //         return 2;
    //     }
    //     return placeTiles(n-1, m)+placeTiles(n-m, m);
    // }
    // public static void main(String args[]){
    //     int n=5,m=4;
    //     System.out.println(placeTiles(n, m));
    // }
    // public static int pairFriends(int n){ //Friends Pairing problem
    //     if(n<=1){
    //         return 1;
    //     }
    //     return pairFriends(n-1)+(n-1)*pairFriends(n-2);
    // }
    // public static void main(String[] args) {
    //     int n=3;
    //     System.out.println(pairFriends(n));
    // }
        // public static void printSubsets(ArrayList<Integer>subset){ //Subsets of a set
        //     for(int i=0;i<subset.size();i++){
        //         System.out.print(subset.get(i)+" ");
        //     }
        //     System.out.println();
        // }
        // public static void findSubsets(int n,ArrayList<Integer>subset){
        //     if(n==0){
        //         printSubsets(subset);
        //         return;
        //     }
        //     findSubsets(n-1, subset);
        //     subset.add(n);
        //     findSubsets(n-1, subset);
        //     subset.remove(subset.size()-1);
        // }
        // public static void main(String[] args) {
        //     int n=3;
        //     findSubsets(n, new ArrayList<Integer>());
        // }
}
