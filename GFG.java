import java.util.Arrays;

public class GFG {
	static boolean areRotations(String s1, String s2) {
		String temp=s1+s1;
		if(s1.length()==s2.length() && (s1+s1).indexOf(s2) !=-1) {
			return true;
		}
		return false;
	}
	static boolean validShuffle(String first, String second, String result) {
		if(first.length()+second.length()!=result.length()) {
			return false;
		}
		int i=0,j=0,k=0;
		while(k!=result.length()) {
			if(i<first.length() && first.charAt(i)==result.charAt(k)) {
				i++;
			}
			else if(j<second.length() && second.charAt(j)==result.charAt(k)) {
				j++;
			}
			else {
				return false;
			}
			k++;
		}
		if(i<first.length() || j<second.length()) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String s1="XY";
		String s2="12";
		String result="1YX2";
		//boolean a=areRotations(s1,s2);
		boolean a = validShuffle(s1,s2,result);
		System.out.println(a);
	}
}
