
public class substring {
    static void subseq(String str,String ans) {
    	if(str.length()==0) {
    		System.out.println(ans);
    		return;
    	}
    	
    	char ch=str.charAt(0);
    	String ros=str.substring(1);
    	
    	subseq(ros,ans);
    	subseq(ros,ans+ch);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       subseq("ABC","");
	}

}
