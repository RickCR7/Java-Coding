import java.util.*;

//Iterative Method[Time complexity-O(n),Space complexity-O(1)]
// class LL1 {
//     Node head;
//     int size;

//     LL1(){
//         size=0;
//     }

//     public class Node{
//         String data;
//         Node next;

//         Node(String data){
//             this.data=data;
//             this.next=null;
//             size++;
//         }
//     }
//     public void addFirst(String data){
//         Node newNode=new Node(data);
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addLast(String data){
//         Node newNode=new Node(data);

//         if(head==null){
//             head=newNode;
//             return;
//         }

//         Node lastNode=head;
//         while(lastNode.next!=null){
//             lastNode=lastNode.next;
//         }
//         lastNode.next=newNode;
//     }
//     public void printList(){
//         Node currNode=head;
//         while(currNode!=null){
//             System.out.print(currNode.data+"->");
//             currNode=currNode.next;
//         }
//         System.out.println("null");
//     }
//     public void reverseList(){
//         if(head==null || head.next==null){
//             return;
//         }
//         Node prevNode=head;
//         Node currNode=head.next;
//         while(currNode != null){
//             Node nextNode=currNode.next;
//             currNode.next=prevNode;
//             prevNode=currNode;
//             currNode=nextNode;
//         }
//         head.next=null;
//         head=prevNode;
//     }
//     public static void main(String[] args) {
//         LL1 list=new LL1();
//         list.addLast("is");
//         list.addLast("a");
//         list.addLast("list");
//         list.addFirst("this");
//         list.printList();
//         list.reverseList();
//         list.printList();
//     }
//Recursive Method
class LL1 {
  Node head;
  int size;
    
        LL1(){
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
        public Node reverseRecursive(Node head){
            if(head==null || head.next==null){
                return head;
            }
            Node newHead=reverseRecursive(head.next);
            head.next.next=head;
            head.next=null;
            return newHead;
        }
        public static void main(String[] args) {
            LL1 list=new LL1();
            list.addLast("is");
            list.addLast("a");
            list.addLast("linked");
            list.addLast("list");
            list.addFirst("this");
            list.printList();
            list.head= list.reverseRecursive(list.head);
            list.printList();
        }
    
        
}
//Collections Method
// import java.util.Collections;
// import java.util.LinkedList;
// class LL1{
//     public static void main(String[] args) {
//        LinkedList<Integer>list=new LinkedList<>();
//         list.add(1);
//         list.add(2);
//         System.out.println(list);
//         Collections.reverse(list);
//         System.out.println(list);
//     }
// }
