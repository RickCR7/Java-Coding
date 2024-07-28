import java.util.*;
public class Heap {
    static class heap{
        ArrayList<Integer> arr=new ArrayList<>();
         public void add(int data){
            //Add at last index
            arr.add(data);
            int x=arr.size()-1;
            int par=(x-1)/2;

            while(arr.get(x)>arr.get(par)){
                //Swap
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par=(x-1)/2;
            }
         }
         public int peek(){
            return arr.get(0);
         }
         private void Heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int maxIdx=i;

            if(left<arr.size() && arr.get(maxIdx)<arr.get(left)){
                maxIdx=left;
            }
            if(right<arr.size() && arr.get(maxIdx)<arr.get(right)){
                maxIdx=right;
            }
            if(maxIdx!=i){
                //Swap
                int temp=arr.get(i);
                arr.set(i,arr.get(maxIdx));
                arr.set(maxIdx,temp);
                Heapify(maxIdx);
            }
         }
         public int remove(){
            int data=arr.get(0);
            //Step1-Swap first and last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //Step2-Delete last element
            arr.remove(arr.size()-1);

            //Step3-Heapify
            Heapify(0);
            return data;
         }
         public boolean isEmpty(){
            return arr.size()==0;
         }
        public static void main(String[] args) {
        heap h=new heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        h.add(2);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
      }
   }
}
