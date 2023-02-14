
public class kStacks {
	static int [] array = new int[10];
	static int k=3;
	static int [] next= {1,2,3,4,5,6,7,8,9,10,-1};
	static int [] top= {-1,-1,-1};
	static int free=0,size=0;
	static boolean isFull() {
		return (size==array.length);
	}
	static boolean isEmpty(int sn) {
		return (top[sn-1]==0);
	}
	static void push(int item,int sn) {
		if(isFull()) {
			System.out.println("STACK FULL!");
			return;
		}
		int i=free;
		free=next[i];
		next[0]=top[sn-1];
		top[sn-1]=i;
		array[i]=item;
		size++;
	}
	static int pop(int sn) {
		int i=top[sn-1];
		top[sn-1]=next[i];
		next[i]=free;
		free=i;
		return array[i];
	}
	public static void main(String[] args) {
		kStacks obj1=new kStacks();
		obj1.push(20, 2);
		obj1.push(25, 2);
		obj1.push(35, 2);
		obj1.push(70, 1);
		obj1.push(75, 1);
		obj1.pop(1);
		obj1.push(84, 1);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		for(int i=0;i<top.length;i++) {
			int stackno=i+1;
			System.out.println("ToS for stack "+ stackno + " "+top[i]);
		}
		for(int i=0;i<next.length;i++) {
			System.out.println(next[i]);
		}
	}
}
