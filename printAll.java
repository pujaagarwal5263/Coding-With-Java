import java.util.ArrayList;
import java.util.List;

public class printAll {
	static List <String> al = new ArrayList <> ();
    static void findSub(String input,String ans) {
    	if(input.length()==0) {
    		al.add(ans);
    		return;
    	}
    	else {
    		findSub(input.substring(1),ans+input.charAt(0));
    		findSub(input.substring(1),ans);
    	}
    }
	public static void main(String[] args) {
		String input="abc";
		findSub(input,"");
		System.out.println(al);
	}

}
