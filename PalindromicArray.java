
public class PalindromicArray {
	static boolean isPalindrome(int num){
        int temp=num;
        int rev=0;
        int rem=0;
        while(num>0){
             rem=num%10;
            rev=rem+(rev*10);
            num=num/10;
        }
        if(temp==rev){
            return true;
        }
        else{
            return false;
        }
    }
	public static int palinArray(int[] a, int n)
           {
             for(int i=0;i<n;i++){
                 boolean b=isPalindrome(a[i]);
                 if(b){
                     continue;
                 }
                 else {
                	 return 0;
                 }
             }
             return 1;
           }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int [] arr= {111,222,32};
	   int m=palinArray(arr,3);
	   System.out.println(m);
	}
}
