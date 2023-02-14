
public class myQueue {
    static int front,rear,size=0,capacity;
    static int [] maxArray;
    
    public myQueue(int capacity) {
    	this.capacity=capacity;
    	maxArray=new int [this.capacity];
    	size=0; front=0;
    	rear=this.capacity-1;
    }
    static void enqueue(int item) {
    	if(isFull()) {
    		System.out.println("Oops! queue FULL. Can't enter: "+item);
    		return;
    	}
    	rear=(rear+1)%capacity;
    	maxArray[rear]=item;
    	size++;
    }
    static void dequeue() {
    	if(isEmpty()) {
    		System.out.println("Oops! nothing to delete");
    		return;
    	}
    	int item=maxArray[front];
    	front=(front+1)%capacity;
    	size--;
    	System.out.println(item + " Dequeued");
    }
    static boolean isEmpty() {
    	return (size==0);
    }
    static boolean isFull() {
    	return (size==capacity);
    }
    static int front() {
    	System.out.println(maxArray[front]);
    	return maxArray[front];
    }
    static int rear() {
    	System.out.println(maxArray[rear]);
    	return maxArray[rear];
    }
    static void printQueue() {
    	int i=front,j=rear;
    	while(j>=i) {
    		System.out.println(maxArray[j]);
    		j--;
    	}
    }
	public static void main(String[] args) {
        myQueue obj=new myQueue(5);
        obj.enqueue(23);
        obj.enqueue(34);
        obj.enqueue(67);
        obj.enqueue(45);
        obj.enqueue(78);
        obj.enqueue(90);
        
        obj.printQueue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
	}
}
