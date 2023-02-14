
public class ScalarProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr1= {2,3,5,7};
      int [] arr2= {1,2,2,5};
      int i=0, j=arr2.length-1;
      int minScalar=0;
      while(i<arr1.length && j>=0) {
    	  minScalar=minScalar+arr1[i]*arr2[j];
    	  //System.out.println(arr1[i]*arr2[j]);
    	  j--;
    	  i++;
      }
      System.out.println(minScalar);
      i=0;j=0;
      int maxScalar=0;
      while(i<arr1.length && j<arr2.length) {
    	  maxScalar=maxScalar+arr1[i]*arr2[j];
    	  i++;
    	  j++;
      }
     System.out.println(maxScalar); 
	}
}
