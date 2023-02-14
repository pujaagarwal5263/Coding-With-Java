
public class myStack {
	static int size;
	static int [] maxArray;
	static int top;
	
    public myStack(int S){
     size=S;
     maxArray=new int[size];
     top=-1;
    }
    public void push(int item) {
    	maxArray[++top]=item;
    }
    public int pop() {
    	if(isEmpty()) {
    		System.out.println("Stack empty can not delete");
    		return -1;
    	}
    	return maxArray[top--];
    }
    public int peek() {
    	return maxArray[top];
    }
    public boolean isEmpty() {
    	return (top==-1);
    }
    public boolean isFull() {
    	return (top==size-1);
    }
    public void deleteMid() {
    	int mid=maxArray.length/2;
    	System.out.println("DELETED: "+maxArray[mid]);
    	for(int i=mid;i<maxArray.length-1;i++) {
    		maxArray[i]=maxArray[i+1];
    	}
    	if(top!=-1) {
    		top--;
    	}
    	
    }
    public void printStack() {
    	for(int i=top;i>=0;i--) {
    		System.out.println(maxArray[i]);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       myStack obj = new myStack(5);
       obj.push(1);
       obj.push(2);
       obj.push(3);
       obj.push(4);
       obj.push(23);
       obj.printStack();
       obj.deleteMid();
       obj.printStack();
	}
}
