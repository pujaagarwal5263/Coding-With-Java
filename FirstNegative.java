import java.util.*;
import java.lang.*;
import java.io.*;
class FirstNegative
 {
	public static void main (String[] args)
	 {
	 //n-k+1 outputs
	 Scanner sc=new Scanner(System.in);
	 int T=sc.nextInt();
	 while(T>0){
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    
	    int a=0;
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int k=sc.nextInt();
	    int[] ans=new int [n-k+1];
	    Deque <Integer> list=new LinkedList<>();
	    int i=0,j=0;
	    while(j<arr.length){
	       
	        if(arr[j]<0){
	            list.offerLast(arr[j]);
	        }
	            if((j-i+1)<k){
	            j++;
	            continue;
	        }
	        else if((j-i+1)==k){
	            if(!list.isEmpty()){
	                ans[a++]=list.peek();
	            }
	            else{
	                ans[a++]=0;
	            }
	            
	            if(arr[i]<0){
	                list.poll();
	            }
	            i++;
	        }
	        j++;
	    }
	     for(int item : ans){
	            System.out.print(item + " ");
	        }
	        System.out.println();
	    T--;
	 }
	 }
}