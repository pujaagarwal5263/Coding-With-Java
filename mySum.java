import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class mySum {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int [] arr= {1,2,2,3,4,5,1};
	  int[] temp=new int[arr.length];
	  int j=0;
	  Arrays.sort(arr);
	  for(int i=0;i<arr.length-1;i++) {
		 if(arr[i]!=arr[i+1]) {
			 temp[j++]=arr[i];
		 }
	  }
	  temp[j++]=arr[arr.length-1];
	  for(int k=0;k<j;k++) {
		  System.out.println(temp[k]);
	  }
	}
}
