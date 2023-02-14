import java.util.Stack;

public class InfixtoPrefix {
    static int Prec(char c) {
    	switch(c)
    	{
    		case '+':
    		case '-':
    			return 1;
    		case '*':
    		case '/':
    			return 2;
    		case '^':
    			return 3;
    	}
    	return -1;	
    }
    static String convert(String exp) {
    	String res="";
    	Stack <Character> stack = new Stack<>();
    	for(int i=0;i<exp.length();i++) {
    		char ch=exp.charAt(i);
    		if(Character.isLetterOrDigit(ch)) {
    			res+=ch;
    		}
    		else if(ch == ')') {
    			stack.push(ch);
    		}
    		else if(ch=='(') {
    			while(!stack.isEmpty() && stack.peek()!=')') {
    				res+=stack.pop();
    			}
    			stack.pop();
    		}
    		else {
    			while(!stack.isEmpty() && Prec(ch)<=Prec(stack.peek())) {
    				res+=stack.pop();
    			}
    			stack.push(ch);
    		}
    		
    	}
    	while(!stack.isEmpty()) {
			if(stack.peek()==')') {
				return "Invalid";
			}
			res+=stack.pop();
		}
    	return res;
    }
    static String reverse(String exp) {
    	char [] rev= new char[exp.length()];
  	  int a=0;
  	  for(int i=exp.length()-1;i>=0;i--) {
  		  rev[a++]=exp.charAt(i);
  	  }
  	  String reverse="";
  	  for(Character temp: rev) {
  		  reverse+=temp;
  	  }
  	  return reverse;
    }
	public static void main(String[] args) {
     String exp="(A+B)*(C+D)"; 
	 String reversed=reverse(exp);
	String r=convert(reversed);
		String RESULT=reverse(r);
		System.out.println(RESULT);
	}
}
