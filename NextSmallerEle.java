import java.util.Stack;

public class NextSmallerEle {
    static int[] NSE(int [] arr) {
    	int a=arr.length-1;
    	int []result = new int [arr.length];
    	Stack <Integer> stack=new Stack<> ();
    	
     	for(int i=arr.length-1;i>=0;i--) {
    		if(stack.isEmpty()) {
    			result[a--]=-1;
    		}
    		else if(!stack.isEmpty() && stack.peek()<arr[i] ) {
    			result[a--]=stack.peek();
    		}
    		else if(!stack.isEmpty() && stack.peek()>=arr[i] ) {
    			while(!stack.isEmpty() && stack.peek()>=arr[i]) {
    				stack.pop();
    			}
    			if(stack.isEmpty()) {
        			result[a--]=-1;
        		}
    			else {
    				result[a--]=stack.peek();
    			}
    		}
    		stack.push(arr[i]);
    	}
    return result; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {4,8,5,2,25};
       int [] result=NSE(arr);
       
       for(int i=0;i<result.length;i++) {
    	   System.out.println(result[i]);
       }
	}

}
