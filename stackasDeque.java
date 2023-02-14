import java.util.Deque;
import java.util.LinkedList;

public class stackasDeque {
	static Deque <Integer> stack=new LinkedList<> ();
	
    static void push(int a) {
    	stack.addFirst(a);
    }
    static int pop() {
    	if (!stack.isEmpty()) {
            return stack.removeFirst();
        }
    	return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		stack.push(34);
		stack.push(89);
		stack.push(45);
		
       System.out.println(stack.pop());
	}

}
