
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int []arr= {2,4,6,8,10};
         int li=0,hi=4;
         int x=5;
         
         boolean flag=true;
         int mi=(li+hi)/2;
         
         while(li<=hi) {
        	 if(arr[mi]==x) {
        		 System.out.println("element found at "+ mi);
        		 flag=false;
        		 break;
        	 }
        	 else if(arr[mi]>x) {
        		 hi=mi-1;
        	 }
        	 else {
        		 li=mi+1;
        	 }
        	 mi=(li+hi)/2;
         }
         if(flag) {
        	 System.out.println("element not found");
         }
	}

}
