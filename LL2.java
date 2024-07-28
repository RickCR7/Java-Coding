import java.util.LinkedList;
import java.util.Collections;
class LL2{
    ListNode head;
    int size;
    
    LL2(){
        size=0;
    }

    public class ListNode{
        String data;
        ListNode next;

        ListNode(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
public ListNode removeNthFromEnd(ListNode head,int n){
    if(head.next==null){
        return null;
    }

    int size=0;
    ListNode temp=head;
    while(temp!=null){
        temp=temp.next;
        size++;
    }
//removing Sizeth node from last i.e. head
if(n==size){
    return head.next;
}
//find previous node
int ptf=size-n;//position to find
ListNode prev=head;//previous node
int cp=1;//current position

while(cp!=ptf){
    prev=prev.next;
    cp++;
}
prev.next=prev.next.next;
return head;
}
public static void main(String[] args) {
  LinkedList<String>list=new LinkedList<>();
  list.add("list");
  list.addLast("a");
  list.addLast("linked");
  list.addLast("list");
  list.addFirst("this");
  list.removeNthFromEnd(ListNode head,int n)
           
}