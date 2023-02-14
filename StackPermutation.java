import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackPermutation {
    static boolean isPermutation(int a[], int b[]) {
    	Queue <Integer> input = new LinkedList <> ();
    	for(int i=0;i<a.length;i++) {
    		input.add(a[i]);
    	}
    	
    	Queue <Integer> output = new LinkedList <> ();
    	for(int i=0;i<b.length;i++) {
    		input.add(b[i]);
    	}
    	
    	Stack <Integer> tempStack=new Stack<> ();
    	while(!input.isEmpty()) {
    	  int element = input.poll();
    	  if(element== output.peek()) {
    		  output.poll();
    		 while(!tempStack.isEmpty()) {
    		  if(output.peek()==tempStack.peek()) {
    			  tempStack.pop();
    			  output.poll();
    			}
    		  else {
    			  break;
    		  }
    		  }
    	  }
    	  else {
    		  tempStack.push(element);
    	  }
    	}
    	return (input.isEmpty() && tempStack.isEmpty());
    }
	public static void main(String[] args) {
		int [] a= {1,2,3};
		int [] b= {2,1,3};
		boolean yup=isPermutation(a,b);
		System.out.println(yup);
	}
}
