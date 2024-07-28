import java.util.HashSet;

public class Recursion2{
    // public static void towerofHanoi(int n,String src,String helper,String dest){//Tower of Hanoi
    //     if(n==1){
    //         System.out.println("transfer disk "+n+" from "+src+" to "+dest);
    //         return;
    //     }
    //     towerofHanoi(n-1,src,dest,helper);
    //     System.out.println("transfer disk "+n+" from "+src+" to "+helper);
    //     towerofHanoi(n-1,helper,src,dest);
    // }
    // public static void main(String args[]){
    //     int n=3;
    //     towerofHanoi(n,"A","B","C");
    // }
    // public static String revString(String str){ //Printing reverse of a string
    //     if(str.length()==1){
    //         return str;
    //     }
    //     char currChar=str.charAt(0);
    //     String nextString=revString(str.substring(1));
    //     return nextString+currChar;
    // }
    // public static void main(String[] args) {
    //     String str="Akash";
    //     String reversed=revString(str);
    //     System.out.println(reversed);
    // }
    // public static int first=-1; //Find first and last occurrence of an element in a string
    // public static int last=-1;
    // public static void  findOccurrence(String str,char element,int idx) {
    //     if(idx==str.length()){
    //         return;
    //     }
    //     if(str.charAt(idx)==element){
    //         if(first==-1){
    //             first=idx;
    //         } else {
    //             last=idx;
    //         }
    //     }
    //     findOccurrence(str, element, idx+1);
    // }
    // public static void main(String[] args) {
    //     String str="akash";
    //     char element='a';
    //     findOccurrence(str, element, 0);
    //     System.out.println("First occurrence : "+first);
    //     System.out.println("Last occurrence : "+last);
    // }
    // public static boolean checkIfIncreasing(int arr[],int idx){ //Check if an array is sorted(strictly increasing)
    //     if(idx==arr.length-1){
    //         return true;
    //     }
    //     if(!checkIfIncreasing(arr, idx+1)){
    //         return false;
    //     }
    //     return arr[idx]<arr[idx+1];
    // }
    // public static void main(String args[]) {
    //     int arr1[]={1,2,3,4,5};
    //     if(checkIfIncreasing(arr1, 0)){
    //         System.out.println("Strictly increasing");
    //     } else {
    //         System.out.println("Not strictly increasing");
    //     }
    // }
    // public static String addX(int count){ //Move all 'x' to end of a string
    //     String newString="x";
    //     for(int i=1;i<count;i++){
    //         newString += 'x';
    //     }
    //     return newString;
    // }
    // public static String moveAllX(String str,int idx,int count){
    //     if(idx==str.length()){
    //         return addX(count);
    //     }
    //     if(str.charAt(idx)=='x'){
    //         return moveAllX(str, idx+1, count+1);
    //     } else {
    //         String nexString = moveAllX(str, idx+1, count);
    //         return str.charAt(idx)+nexString;
    //     }
    // }
    // public static void main(String[] args) {
    //     String str="abcdefxghxixjxxxk";
    //     int count=0;
    //     String newString=moveAllX(str, 0, count);
    //     System.out.println(newString);
    // }
    // public static String removeDuplicates(String str,int idx,boolean present[]){ //Remove duplicates in a string
    //     if(idx==str.length()){
    //         return "";
    //     }
    //     char currChar=str.charAt(idx);
    //     if(present[currChar-'a']){
    //         return removeDuplicates(str, idx+1, present);
    //     } else {
    //         present[currChar-'a']=true;
    //         return currChar+removeDuplicates(str, idx+1, present);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str="abcadbcefghabi";
    //     boolean present[]=new boolean[str.length()];
    //     System.out.println(removeDuplicates(str, 0, present));
    // }
    // public static void printSubseq(String str,int idx,String res){ //Print subsequences of a string
    //     if(idx==str.length()){
    //         System.out.println(res);
    //         return;
    //     }
    //     //choose
    //     printSubseq(str, idx+1, res+str.charAt(idx));
    //     //don't choose
    //     printSubseq(str, idx+1, res);
    // }
    // public static void main(String[] args) {
    //     String str="abc";
    //     printSubseq(str, 0, "");
    // }
    // public static void printSubseq(String str,int idx,String res,HashSet<String>allSubseq){ //Print all unique subsequences of a string
    //     if(idx==str.length()){
    //         if(allSubseq.contains(res)){
    //             return;
    //         }
    //         allSubseq.add(res);
    //         System.out.println(res);
    //         return;
    //     }
    //      //choose
    //     printSubseq(str, idx+1, res+str.charAt(idx), allSubseq);
    //     //don't choose
    //     printSubseq(str, idx+1, res, allSubseq);
    // }
    // public static void main(String[] args) {
    //     String str="aaa";
    //     HashSet<String>allSubseq=new HashSet<>();
    //     printSubseq(str, 0, "", allSubseq);
    // }
        public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};//Printing keypad combination
        public static void printKeypad(String number,int idx,String res){
            if(idx==number.length()){
                System.out.println(res);
                return;
            }
            for(int i=0;i<keypad[number.charAt(idx)-'0'].length();i++){
                char curr=keypad[number.charAt(idx)-'0'].charAt(i);
                printKeypad(number, idx+1, res+curr);
            }
        }
        public static void main(String[] args) {
            String number="3";
            printKeypad(number, 0, "");
        }
}