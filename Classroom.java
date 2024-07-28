import java.util.*;
public class Classroom {
    //Heap Sort
//    public static void heapify(int arr[],int i,int size){
//     int left=2*i+1;
//     int right=2*i+2;
//     int maxIdx=i;

//     if(left<size && arr[left]>arr[maxIdx]){
//         maxIdx=left;
//     }
//     if(right<size && arr[right]>arr[maxIdx]){
//         maxIdx=right;
//     }
//     if(maxIdx!=i){
//         //swap
//         int temp=arr[i];
//         arr[i]=arr[maxIdx];
//         arr[maxIdx]=temp;

//         heapify(arr, maxIdx, size);
//     }
//    }
//    public static void heapSort(int arr[]){
//     //Step1-Build Max Heap
//     int n=arr.length;
//     for(int i=n/2;i>=0;i--){
//         heapify(arr,i, n);
//     }
//     //Step2-Sorting
//     for(int i=n-1;i>0;i--){
//         //swap
//         int temp=arr[0];
//         arr[0]=arr[i];
//         arr[i]=temp;

//         heapify(arr,0, i);
//     }
//    }
//Nearest K Cars
    // static class Point implements Comparable<Point>{
    //     int x;
    //     int y;
    //     int distsq;
    //     int idx;
    //     public Point(int x,int y,int distsq,int idx){
    //         this.x=x;
    //         this.y=y;
    //         this.distsq=distsq;
    //         this.idx=idx;
    //     }
    //     @Override
    //     public int compareTo(Point p2){
    //         return this.distsq-p2.distsq; //Ascending Order
    //     }
    // }

    // static class Row implements Comparable<Row>{ //Weakest Soldier Problem
    //     int soldiers;
    //     int idx;

    //     public Row(int soldiers,int idx){
    //         this.soldiers=soldiers;
    //         this.idx=idx;

    //     }
    //     @Override
    //     public int compareTo(Row r2){
    //         if(this.soldiers==r2.soldiers){
    //             return this.idx-r2.idx;
    //         } else {
    //             return this.soldiers-r2.soldiers;
    //         }
    //     } 
    // }

    static class Pair implements Comparable<Pair>{ //Sliding Window Problem
        int num; 
        int idx;
        public Pair(int num,int idx){
            this.num=num;
            this.idx=idx;
        }
        @Override
        public int compareTo(Pair p2){
            //Descending(Max Heap)
            return p2.num-this.num;
        }
    }
   public static void main(String args[]) {
    // int arr[]={1,2,4,5,3}; //Heap Sort
    // heapSort(arr);

    // //print
    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    // }
    // System.out.println();


    // int points[][]={{3,3},{5,-1},{-2,4}}; //Nearest K cars
    // int k=2;
    // PriorityQueue<Point>pq=new PriorityQueue<>();
    // for(int i=0;i<points.length;i++){
    //     int distsq=(points[i][0]*points[i][0])+(points[i][1]*points[i][1]);
    //     pq.add(new Point(points[i][0], points[i][1], distsq, i));
    // }
    // //Nearest K cars print
    // for(int i=0;i<k;i++){
    //     System.out.println("C"+pq.remove().idx);
    // }


    //  int ropes[]={2,3,3,4,6}; //Connect N ropes
    //  PriorityQueue<Integer>pq=new PriorityQueue<>();
    //  for(int i=0;i<ropes.length;i++){
    //     pq.add(ropes[i]);
    //  }
    //  int cost=0;
    //  while(pq.size()>1){
    //     int min=pq.remove();
    //     int min2=pq.remove();
    //     cost+=min+min2;
    //     pq.add(min+min2);
    //  }
    //  System.out.println("Cost of counting N ropes = "+cost);


    // int army[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
    // int k=2;
    // PriorityQueue<Row>pq=new PriorityQueue<>();

    // for(int i=0;i<army.length;i++){
    //     int count=0;
    //     for(int j=0;j<army[0].length;j++){
    //         count+=army[i][j]==1?1:0;
    //     }
    //     pq.add(new Row(count, i));
    // }
    // for(int i=0;i<k;i++){
    //     System.out.println("R"+pq.remove().idx);
    // }

    int arr[]={1,3,-1,-3,5,3,6,7};
    int k=3;//Window Size
    int res[]=new int[arr.length-k+1];//n-k+1
    PriorityQueue<Pair>pq=new PriorityQueue<>();
    //1st Window
    for(int i=0;i<k;i++){
        pq.add(new Pair(arr[i], i));
    }
    res[0]=pq.peek().num;
    for(int i=k;i<arr.length;i++){
        while(pq.size()>0 && pq.peek().idx<=(i-k)){
            pq.remove();
        }
        pq.add(new Pair(arr[i], i));
        res[i-k+1]=pq.peek().num;
    }
    //Print
    for(int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");
    }
    System.out.println();
   }
}
