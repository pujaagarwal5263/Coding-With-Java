import java.util.ArrayList;

public class CircularQueue {
    static ArrayList <Integer> queue = new ArrayList<> ();
    static int size,front,rear;
    
    public CircularQueue(int size) {
    	this.size=size;
    	this.front=this.rear=-1;
    }
    static void enQueue(int item) {
    	//check if full
    	if((front==0 && rear==size-1)|| rear == (front - 1) % (size - 1)) {
    		System.out.println("Queue full");
    		return;
    	}
    	//check if empty
    	else if(front==-1) {
    		front=0;
    		rear=0;
    		queue.add(rear,item);
    	}
    	else if(rear==size-1 && front!=0) {
    		rear=0;
    		queue.set(rear,item);
    	}
    	else {
    		rear=rear+1;
    		//adding new value
    		if(front<=rear) {
    			queue.add(rear,item);
    		}
    		else {
    			queue.set(rear, item);
    		}
    	}
    }
    static int deQueue() {
    	int temp;
    	if(front==-1) {
    		System.out.println("stack empty");
    		return -1;
    	}
    	temp=queue.get(front);
    	//for only one element
    	if(rear==front) {
    		front=-1;
    		rear=-1;
    	}
    	//if front is near to end point
    	else if(front==size-1) {
    		front=0;
    	}
    	else {
    		front+=1;
    	}
    	return temp;
    }
    static void printQueue() {
    	//if front is smaller than rear i.e insertion is regular
    	if(front<=rear) {
    		for(int i=front;i<=rear;i++) {
    			System.out.println(queue.get(i));
    		}
    	}
    	else {
    		//to print elements between front and size
    		for(int i=front;i<size;i++) {
    			System.out.println(queue.get(i));
    		}
    		//to print from 0th index to rear
    		for(int i=0;i<=rear;i++) {
    			System.out.println(queue.get(i));
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         CircularQueue obj=new CircularQueue(5);
         obj.enQueue(5);
         obj.enQueue(7);
         obj.enQueue(9);
         obj.enQueue(4);
         obj.enQueue(91);
         obj.enQueue(66);
         
         obj.printQueue();
         
         obj.deQueue();
         obj.printQueue();
	}

}
