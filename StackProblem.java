import java.util.*;
public class StackProblem {
    public static void pusAtBottom(Stack<Integer>s,int data){ //Push elements ata the bottom of the stack
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int temp=s.pop();
        pusAtBottom(s, data);
        s.push(temp);
    }

    public static void reverse(Stack<Integer>s){ //Reversing a stack
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pusAtBottom(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        //pusAtBottom(stack, 4);
        reverse(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
