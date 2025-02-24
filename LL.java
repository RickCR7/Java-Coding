class LL {
    Node head;
    int size;

    LL(){
        size=0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }
    public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public int getSize(){
        return size;
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("Empty list,nothing to delete");
            return;
        }
        head=this.head.next;
        size--;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("Empty list,nothing to delete");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node currNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            currNode=currNode.next;
            lastNode=lastNode.next;
        }
        currNode.next=null;
    }
    public void reverseList(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode != null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
        // System.out.println(list.getSize());
        // list.removeFirst();
        // list.removeLast();
        // list.printList();
        // System.out.println(list.getSize());
        list.reverseList();
        list.printList();
    }
}
//Shortcut
// import java.util.*;
// class LL{
//     public static void main(String[] args) {
//         LinkedList<String>list=new LinkedList<>();
//         list.add("is");//Add Function
//         list.add("a");
//         list.addLast("list");
//         list.addFirst("this");
//         System.out.println(list);
//         list.add(3, "linked");//Add in between function
//         System.out.println(list);
//         System.out.println(list.get(0));//Get function
//         System.out.println(list.size());//Size of the list
//         // list.remove(3);//Removing and element from the list
//         // list.removeFirst();//Remove function
//         // list.removeLast();
//         // System.out.println(list);
//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i)+"->");
//         }
//         System.out.println();
    
//     }
// }