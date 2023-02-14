import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class interleaveStack {
     static Queue <Integer> q=new LinkedList<> ();
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.add(16);
		q.add(17);
		q.add(18);
		q.add(19);
		q.add(20);
		
		int halfSize=q.size()/2;
		Stack<Integer> stack=new Stack <> ();
		Queue <Integer> result=new LinkedList<> ();
		
		//push first half to stack  
		//stack: 15 14 13 12 11
		//queue: 16 17 18 19 20
		for(int i=0;i<halfSize;i++) {
			stack.push(q.poll());
		}
		
		//enqueue stack elements back to stack 
		//Queue: 16 17 18 19 20 15 14 13 12 11
		// stack: empty
		for(int i=0;i<halfSize;i++) {
			q.add(stack.pop());
		}
		
		//put the first half at backside
		//queue: 15 14 13 12 11 16 17 18 19 20
		for(int i=0;i<halfSize;i++) {
			q.add(q.poll());
		}
		
		//push first half again to stack
		//stack: 11 12 13 14 15
		//queue: 16 17 18 19 20
		for(int i=0;i<halfSize;i++) {
			stack.push(q.poll());
		}
		
		//interleave stack and queue
		while(!q.isEmpty()) {
			result.add(stack.pop());
			result.add(q.poll());
		}
		System.out.println(result);
	}

}
