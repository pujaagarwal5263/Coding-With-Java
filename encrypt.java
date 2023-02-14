import java.util.*;
import java.lang.*;
import java.io.*;
class encrypt
 {
	public static void main (String[] args)
	 {
	   Scanner sc=new Scanner(System.in);
	   Map <Character,Integer> map = new LinkedHashMap <Character,Integer> ();
	   int T = sc.nextInt();
	   String res="";
	   while(T>=0){
	     String str=sc.next();
	     for(int i=str.length()-1;i>=0;i--){
	         if(Character.isLetter(str.charAt(i))){
	             if(map.containsKey(str.charAt(i))){
	                 map.put(str.charAt(i),map.get(str.charAt(i))+1);
	             }
	             else{
	                 map.put(str.charAt(i),1);
	             }
	         }
	     }
	     
	     T--;
	   }
	   System.out.println(map);
	 }
}