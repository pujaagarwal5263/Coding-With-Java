public class remove_duplicates{
	static String remove_duplicates(String s) {
		if(s.length()<=1)
            return s;
        if(s.charAt(0)==s.charAt(1))
            return remove_duplicates(s.substring(1));
        else
            return s.charAt(0) + remove_duplicates(s.substring(1));
	}
	
	static String moveallX(String s) {
		if(s.length()==0) {
			return "";
		}
		char ch=s.charAt(0);
		String ans=moveallX(s.substring(1));
		
		if(ch=='x') return(ans+ch);
		
		return ch+ans;
	}
	public static void main(String[] args) {
		String my_str=remove_duplicates("aaaaeeebbbhhhaaee");
		System.out.println(my_str);
		
		String my_x=moveallX("axbxb");
		System.out.println(my_x);
	}
}