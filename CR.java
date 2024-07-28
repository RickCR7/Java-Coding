import java.util.*;
public class CR {
    public static boolean isAnagram(String s,String t){ //Valid Anagram
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch)-1);
                }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        // int arr[]={1,3,2,5,1,3,1,5,1}; //Majority Element
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        // }
        // Set<Integer> keyset=map.keySet();
        // for (Integer keys : keyset) {
        //     if(map.get(keys)>arr.length/3){
        //         System.out.println(keys);
        //     }
        // }
        // String s="care";
        // String t="race";
        //System.out.println(isAnagram(s, t));
        HashSet<Integer> set=new HashSet<>(); //HashSet
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        System.out.println(set);
        // if(set.contains(2)){
        //     System.out.println("Set contains 2");
        // }
        // if(set.contains(3)){
        //     System.out.println("Set contains 3");
        // }
        // set.remove(2);
        // System.out.println(set.size());
        // set.clear();
        // System.out.println(set.size());
        // System.out.println(set.isEmpty());
        LinkedHashSet<String> lhs=new LinkedHashSet<>(); //Linked HashSet
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Kolkata");
        lhs.add("Bengaluru");
        System.out.println(lhs);

        TreeSet<String> ts=new TreeSet<>(); //TreeSet
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Kolkata");
        ts.add("Bengaluru");
        System.out.println(ts);

        Iterator<Integer> it=set.iterator(); //Iterators
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for (String city : ts) { //Enhanced for loop
            System.out.println(city);
            
        }
    }
}
