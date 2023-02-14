
public class Recursion {
    static void OnetoN(int n) {
    	if(n==1) {
    		System.out.println(n);
    		return;
    	}
    	OnetoN(n-1);
    	System.out.println(n); 
    	//print after recursive call to save value into function
    }
    static void NtoOne(int n) {
    	if(n==1) {
    		System.out.println(n);
    		return;
    	}
    	System.out.println(n);
    	//declared before to directly print without storing
    	NtoOne(n-1);
    }
    static int fact=1;
    static void factorial(int num) {
    	if(num==1) {
    		fact*=num;
    		return;
    	}
    	factorial(num-1);
    	fact=fact*num; //declared afterwards to store value into function
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        OnetoN(6);
        NtoOne(6);
        factorial(5);
        System.out.println(fact);
	}
}
