
public class quick_sort {
    static int Partition(int[] A, int lo, int hi) {
    	int pivot=A[(hi-lo)/2];
    	
    	while(lo<hi) {
    		while(A[lo]<pivot) {
    			lo++;
    		}
    		while(A[hi]>pivot) {
    			hi--;
    		}
    		if(lo<hi) {
    			int temp=A[lo];
    			A[lo]=A[hi];
    			A[hi]=temp;
    			lo++;
    			hi--;
    		}
    	}
    	return lo;
    }
    static void QuickSort(int [] A, int lo, int hi) {
    	//int mid=(hi-lo)/2;
    	int pi=Partition(A,lo,hi);
    	if(lo<pi-1) {
    		QuickSort(A,lo,pi-1);
    	}
    	if(pi<hi) {
    		QuickSort(A,pi+1,hi);
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {22,11,56,89,6};
        QuickSort(arr,0,4);
        for(int i=0;i<5;i++) {
        	System.out.println(arr[i]);
        }
	}
}