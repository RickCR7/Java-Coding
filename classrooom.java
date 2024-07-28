import java.util.HashMap;
public class classrooom {
    public static String getStart(HashMap<String,String> tickets){ //Itirenary of tickets
        HashMap<String,String> revMap=new HashMap<>();
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key),key);
        }
        for (String key : tickets.keySet()) {
            if(!revMap.containsKey(key)){
                return key; //Start
            }
        }
        return null;
    }
    public static void main(String[] args) {
        // HashMap<String,String> tickets=new HashMap<>();
        // tickets.put("Chennai", "Bengaluru");
        // tickets.put("Mumbai","Delhi");
        // tickets.put("Goa", "Chennai");
        // tickets.put(("Delhi"), "Goa");
        // String start=getStart(tickets);
        // System.out.print(start);
        // for (String key : tickets.keySet()) {
        //     System.out.print("->"+tickets.get(start));
        //     start=tickets.get(start); //Updation
        // }
        // System.out.println();

        // int arr[]={15,-2,2,-8,1,7,10,23}; //Largest subarray with 0 sum
        // HashMap<Integer,Integer> map=new HashMap<>();
        // //(sum,idx)
        // int sum=0;
        // int len=0;

        // for(int j=0;j<arr.length;j++){
        //     sum+=arr[j];
        //     if(map.containsKey(sum)){
        //         len=Math.max(len,j-map.get(sum));
        //     } else {
        //         map.put(sum,j);
        //     }
        // }
        // System.out.println("Largest subarray with sum as 0 = "+len);

        int arr[]={10,2,-2,-20,10}; //Subarray with sum equal to k
        int k=-10;
        HashMap<Integer,Integer> map=new HashMap<>();
        //(sum,count)
        map.put(0,1);
        int sum=0;
        int ans=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];//sum[j]
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);
    }
}
