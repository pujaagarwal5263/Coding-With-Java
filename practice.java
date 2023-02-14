import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class practice {
	static void find_symmetric_pairs(int[][] arr) {
		HashMap <Integer, Integer> hs=new HashMap<Integer, Integer> ();
		for(int i=0;i<arr.length;i++) {
			int first=arr[i][0];
			int second=arr[i][1];
			
			Integer val=hs.get(second);
			
			if(val!=null && val==first) {
				System.out.println(first + " " + second + " ");
			}
			else {
				hs.put(first,second);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[][] = new int[5][2];
	        arr[0][0] = 1; arr[0][1] = 2;
	        arr[1][0] = 3; arr[1][1] = 4;
	        arr[2][0] = 5; arr[2][1] = 6;
	        arr[3][0] = 2; arr[3][1] = 1;
	        arr[4][0] = 4; arr[4][1] = 3;
	        System.out.print( "Symmetric pairs : ");
	        find_symmetric_pairs(arr);
	}
}
