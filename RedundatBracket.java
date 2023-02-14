import java.util.Stack;

public class RedundatBracket {
    static boolean checkRedundant(String exp) {
    	Stack <Character> stack = new Stack <> ();
    	for(int i=0;i<exp.length();i++) {
    	if(exp.charAt(i)==')') {
    			
    			if(stack.peek()=='(') {
    				return true;
    			}
    		    else {
    			while(!stack.isEmpty() && stack.peek()!='(') {
    				stack.pop();
    			}
    			stack.pop();
    	       }
    		}
    	else {
    			stack.push(exp.charAt(i));
    		    }
    	}
    	return false;
    }
    //false means no redundant
	public static void main(String[] args) {
        String exp="((a+b))-(c)";
        boolean a=checkRedundant(exp);
        System.out.println(a);
	}
}
