import java.util.HashMap;
import java.util.Map;

public class commonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [][] matrix = {{1,2,1,4,8},{3,7,8,5,1},{8,7,7,3,1},{8,1,2,7,9}};
       Map <Integer,Integer> map = new HashMap<Integer,Integer> ();
       for(int j=0;j<5;j++) {
    	   map.put(matrix[0][j],1);
       }
       for(int i=0;i<matrix.length;i++) {
    	   for(int j=0;j<matrix[0].length;j++) {
    		   if(map.get(matrix[i][j])!=null && map.get(matrix[i][j])==i) {
    			   map.put(matrix[i][j],i+1);
    		   
    		   if(i==matrix.length-1) {
    			   System.out.println(matrix[i][j]);
    		   }
    		 }
    	   }
    	   
       }
  	}
}
