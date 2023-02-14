
public class maxSumSubarray {
    static int maxSum(int [] arr, int k) {
    	int sum=0;
    	int i=0,j=0;
    	int res=Integer.MIN_VALUE;
    	
    	while(j<arr.length) {
    		sum=sum+arr[j];
    		if((j-i+1) < k) {
    			j++;
    		
    		}
    		else if((j-i+1) == k) {
    			res=Math.max(sum,res);
    			sum=sum-arr[i];
    			i++;
    			j++;
    		}
    		
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {1,2,3,4,5,6,7,8,9};
       int maximum=maxSum(arr,3);
       System.out.println(maximum);
      
	}

}
