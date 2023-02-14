import java.util.ArrayList;

public class string_subseq {
	static ArrayList<String> subseq(String S){
		if(S.length()==0){
			ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        
        char ch= S.charAt(0);
        
        String ros=S.substring(1);
        ArrayList<String> rec= subseq(ros);
        
        ArrayList<String> ans=new ArrayList<>();
        
        for(String i: rec){
            ans.add("" + i);
            ans.add(ch + i);
        }
        return ans;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList mystr=subseq("Puja");
        System.out.println(mystr);
	}

}
