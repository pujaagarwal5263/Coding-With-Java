
public class InserionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {5,2,1,6,4};
      
      int temp,j;
      for(int i=1;i<arr.length;i++) {
    	  temp=arr[i];
    	  j=i;
    	  while(j>0 && arr[j-1]>temp) {
    		  arr[j]=arr[j-1];
    		  j--;
    	  }
    	  arr[j]=temp;
      }
      for(int z=0;z<arr.length;z++) {
      System.out.println(arr[z]);
      }
	}

}
