
public class maxOfArray {
    static int maxArray(int [] arr, int idx) {
    	if(idx==arr.length-1) {
    		return arr[idx];
    	}
    	
    	int max=maxArray(arr,idx+1);
    	
    	if(max>arr[idx])return max;
    	else return arr[idx];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] array= {22,2,33,7,19};
       int ans=maxArray(array,0);
       System.out.println(ans);
	}

}
