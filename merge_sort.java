
public class merge_sort {
	static int count=0;
	static void merge(int [] A, int mid, int li, int hi){
     int i=li,j=mid+1,k=li;
     int [] B=new int[hi+1];
     
     while(i<=mid && j<=hi) {
    	 if(A[i]>A[j]) {
    		 B[k]=A[i];
    		 i++;
    		 k++;
    	 }
    	 else {
    		 B[k]=A[j];
    		 j++;
    		 k++;
    	 }
    	 count++;
     }
     
     while(i<=mid) {
    	 B[k]=A[i];
    	 i++;
    	 k++;
    	 count++;
     }
     while(j<=hi) {
    	 B[k]=A[j];
    	 j++;
    	 k++;
    	 count++;
     }
     
     for(int z=0;z<=hi;z++) {
    	 A[z]=B[z];
     }
            }
    static void MergeSort(int [] A, int li, int hi){
    	
    	if(li<hi){
            int mid=li+(hi-li)/2;
            MergeSort(A,li,mid);
            MergeSort(A,mid+1,hi);
            merge(A,mid,li,hi);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A={12,8,5};
		MergeSort(A,0,2);
		printArray(A);
		System.out.println("cont: "+count);
	}

}
