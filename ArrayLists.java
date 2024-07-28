import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();
        ArrayList<String>list1=new ArrayList<String>();
        ArrayList<Boolean>list2=new ArrayList<Boolean>();

        //Add Elements
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //To get an element
        int element=list.get(0);
        System.out.println(element);

        //Add element in between
        list.add(1,3);
        System.out.println(list);

        //Set element
        list.set(0, 0);
        System.out.println(list);

        //Delete/Remove elements
        list.remove(0);
        System.out.println(list);

        //Size of list
        int size=list.size();
        System.out.println(size);

        //Loops on list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        
        //Sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println(list);
    }
}
