import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class givenOrder {
	static int count(int[] arr,int num) {
		int count=0;
		for(int k=0;k<arr.length;k++) {
			if(arr[k]==num) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int [] arr1= {3,10,6,13,9,6,10,13,14,9};
		int [] arr2= {6,10,9,3,13};
		int s1=arr1.length;
		int s2=arr2.length;
		int []temp= new int[s1];
		int s3=0;
		Map<Integer,Integer> hs=new LinkedHashMap<>();
		for(int i=0;i<s2;i++) {
			int getCount=count(arr1,arr2[i]);
			hs.put(arr2[i],getCount);
			s3=s3+getCount;
		}
		int tempSize=hs.size();
		System.out.println(hs);
		/*int b=0;
		while(tempSize>=0) {
			int myCount=hs.get(arr2[b]);
			while(myCount>0) {
				System.out.println(arr2[b]);
				temp[s3]=arr2[b];
				s3++;
				myCount--;
			}
			b++;
			tempSize--;
		}
		for(int p=0;p<s3;p++) {
			System.out.println(temp[p]);
		}
		/*if(s3<s1) {
			for(int i=0;i<s1;i++) {
				for(int j=0;j<s3;j++) {
					if(arr1[i]!=)
				}
			}
		}*/
	}
}
