
public class MyStrings {
    static String toogle(String s) {
    	String s1="";
    	for(int i=0;i<s.length();i++) {
    	if(Character.isUpperCase(s.charAt(i))) {
    		s1+=Character.toLowerCase(s.charAt(i));
    	}
    	else {
    		s1+=Character.toUpperCase(s.charAt(i));
    	}
    	}
    	return s1;
    }
    static int len(String s) {
    	int length=0;
    	for(char ch: s.toCharArray()) {
    		length++;
    	}
    	return length;
    }
    static boolean isPalindrome(String s) {
    	char[] c= s.toCharArray();
    	String str="";
    	for(int i=c.length-1;i>=0;i--) {
    		str+=c[i];
    	}
    	System.out.println("Reverse: "+str);
    	if(str.equals(s)) {
    		return true;
    	}
    	return false;
    }
    static String keepCharacters(String s) {
    	String str=s.replaceAll("[^a-zA-Z]","");
    	return str;
    }
    static String capitalize(String s) {
    	String [] str = s.split("\\s");
    	String newstr="";
    	for(String p: str) {
    	String firstchar= p.substring(0,1);
    	String restchar = p.substring(1, p.length()-1);
    	String lastchar = p.substring(p.length()-1);
    	newstr+=firstchar.toUpperCase()+restchar+lastchar.toUpperCase()+" ";
    	}
    	return newstr;
    }
	public static void main(String[] args) {
         String s="the boy is good";
         int myLen=len(s);
         String s1=toogle(s);
         boolean a=isPalindrome(s);
         String noChar = keepCharacters(s);
         String myCap= capitalize(s);
         System.out.println(myLen);
         System.out.println(s1);
         System.out.println(a);
         System.out.println(noChar);
         System.out.println(myCap);
	}

}
