
public class Sorting {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={7,8,1,3,2};
        //1.Bubble Sort(Time Complexity-O(n^2))
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //2.Selection Sort(Time Complexity-O(n^2))
        // for(int i=0;i<arr.length-1;i++){
        //     int smallest=i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]<arr[smallest]){
        //             smallest=j;
        //         }
        //     }
        //     int temp=arr[smallest];
        //     arr[smallest]=arr[i];
        //     arr[i]=temp;
        // }
        //3.Insertion Sort(Time Complexity-O(n^2))
        // for(int i=1;i<arr.length;i++){
        //     int current=arr[i];
        //     int j=i-1;
        //     while(j>=0 && arr[j]>current){
        //         //Keep swapping
        //         arr[j+1]=arr[j];
        //         j--;
        //     }
        //     arr[j+1]=current;
        // }
        printArray(arr);
    }
}
