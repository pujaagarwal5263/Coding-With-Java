import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class stringDuplicates {
   /*static String removeDuplicates(String S) {
    	String res="";
    	Map <Character, Boolean> map=new HashMap<Character, Boolean> ();
    	for(int i=0;i<S.length();i++) {
    		if(map.get(S.charAt(i))!=null && map.get(S.charAt(i))==true) {
    			continue;
    		}
    		else {
    			map.put(S.charAt(i),true);
    			res+=S.charAt(i);
    		}
    	}
    	return res;
    }*/
	
   static void printDuplicates(String S) {
	   Map <Character,Integer> hs= new HashMap<Character,Integer>();
	   for(int i=0;i<S.length();i++) {
		   if(hs.containsKey(S.charAt(i))){
			   hs.put(S.charAt(i),hs.get(S.charAt(i))+1);
		   }
		   else {
			   hs.put(S.charAt(i),1);
		   }
	   }
	   for(int i=0;i<hs.size();i++) {
		   if(hs.get(S.charAt(i))>1) {
			   System.out.println(S.charAt(i));
		   }
	   }
   }
   static String removeDuplicates(String S) {
	   String res="";
	   for(int i=0;i<S.length();i++) {
		   char c=S.charAt(i);
		   if(res.indexOf(c)<0) {
			   res+=c;
		   }
	   }
	   return res;
   }
	public static void main(String[] args) {
		String S = "cbacdcbc";
	    String result=removeDuplicates(S);
        System.out.println(result);
        printDuplicates(S);
	}
}
