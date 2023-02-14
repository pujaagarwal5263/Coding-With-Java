
public class blockSwap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {1,2,3,4,5,6};
     int rot=2;
     int[] temp=new int[rot];
     for(int i=0;i<rot;i++) {
    	 temp[i]=arr[i];
     }
     int var=rot;
     int i=0;
     while(var<arr.length) {
    	 arr[i]=arr[var];
    	 i++;
    	 var++;
     }
     int k=0;
     for(int p=arr.length-rot;p<arr.length;p++) {
    	 arr[p]=temp[k];
    	 k++;
     }
     for(int q=0;q<arr.length;q++) {
    	 System.out.println(arr[q]);
     }
	}

}
