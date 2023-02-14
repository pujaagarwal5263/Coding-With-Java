
public class equilibriumPoint {
	public static int left_sum(int [] arr, int index) {
		int sum_left=0;
		int i=0;
		while(i<index) {
			sum_left+=arr[i];
			i++;
		}
		return sum_left;
	}
	public static int right_sum(int[] arr,int index) {
		int sum_right=0;
		int i=index+1;
		while(i<arr.length) {
			sum_right+=arr[i];
			i++;
		}
		return sum_right;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,1,2};
	     for(int i=0;i<arr.length;i++) {
	    	 int left=left_sum(arr,i);
	    	 int right=right_sum(arr,i);
	    	 if(left==right) {
	    		 System.out.println(arr[i]);
	    		 break;
	    	 }
	     }
	}

}
