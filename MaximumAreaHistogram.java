
/*Maximum area histogram (MAH)
width = NSR(index) - NSL(index)-1
Area[i] = arr[i] * width[i];
from area find maximum

// output
 * 
 Nearest smaller element  Index to left  = [-1, -1, 1, 1, 3, -1, 5]
Nearest smaller element Index to Right  = [1, 5, 3, 5, 5, 7, 7]
widthOfHistogram =  NSR-NSL-1 ---[1, 5, 1, 3, 1, 7, 1]
areaOfHistogram = widthOfHistogram[i] * arr[i]-- [6, 10, 5, 12, 5, 7, 6]
 maximum are histogram = maximum element in area 12
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


import java.util.List;
import java.util.Stack;

public class MaximumAreaHistogram {

	class Pair {
		int num;
		int index;

		Pair(int num, int index) {
			this.num = num;
			this.index = index;
		}
	}
//NSL
	private static List<Integer> nearestSmallerElementIndexLeft(int[] arr) {

		Stack<Pair> stack = new Stack<>();
		List<Integer> NSLIndexList = new ArrayList<>();
		int pseudoIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			if (stack.isEmpty()) {
				NSLIndexList.add(pseudoIndex);
			} else if (stack.size() > 0 && arr[i] > stack.peek().num) {
				NSLIndexList.add(stack.peek().index);
			} else if (stack.size() > 0 && arr[i] <= stack.peek().num) {
				while (stack.size() > 0 && arr[i] <= stack.peek().num) {
					stack.pop();
				}
				if (stack.size() == 0) {
					NSLIndexList.add(pseudoIndex);
				} else {
					NSLIndexList.add(stack.peek().index);
				}
			}
			stack.push(new MaximumAreaHistogram().new Pair(arr[i], i));
		}

		return NSLIndexList;
	}

	private static List<Integer> nearestSmallerElementIndexRight(int[] arr) {

		Stack<Pair> stack = new Stack<>();
		List<Integer> NSRIndexList = new ArrayList<>();
		int pseudoIndex = arr.length;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (stack.isEmpty()) {
				NSRIndexList.add(pseudoIndex);
			} else if (stack.size() > 0 && arr[i] > stack.peek().num) {
				NSRIndexList.add(stack.peek().index);
			} else if (stack.size() > 0 && arr[i] <= stack.peek().num) {
				while (stack.size() > 0 && arr[i] <= stack.peek().num) {
					stack.pop();
				}
				if (stack.size() == 0) {
					NSRIndexList.add(pseudoIndex);
				} else {
					NSRIndexList.add(stack.peek().index);
				}
			}
			stack.push(new MaximumAreaHistogram().new Pair(arr[i], i));
		}

		return NSRIndexList;
	}

	public static void main(String[] args) {

		int arr[] = { 6, 2, 5, 4, 5, 1, 6 };

		int[] widthOfHistogram = new int[arr.length];
		int[] areaOfHistogram = new int[arr.length];

		List<Integer> woh = new ArrayList<>(); //width of histogram
		List<Integer> aoh = new ArrayList<>(); //area of histogram

		List<Integer> nearestSmallerElementIndexLeft = nearestSmallerElementIndexLeft(arr);
		Object[] array = nearestSmallerElementIndexLeft.toArray();
		List<Integer> nearestSmallerElementIndexRight = nearestSmallerElementIndexRight(arr);
		System.out.println("Nearest smaller element  Index to left  = " + nearestSmallerElementIndexLeft);
		Collections.reverse(nearestSmallerElementIndexRight);
		System.out.println("Nearest smaller element Index to Right  = " + nearestSmallerElementIndexRight);

		// width = NSR-NSL-1
		for (int i = 0; i < arr.length; i++) {
			widthOfHistogram[i] = nearestSmallerElementIndexRight.get(i) - nearestSmallerElementIndexLeft.get(i) - 1;
			woh.add(widthOfHistogram[i]);
		}
		System.out.println("widthOfHistogram =  NSR-NSL-1 ---" + woh);

		for (int i = 0; i < arr.length; i++) {
			areaOfHistogram[i] = widthOfHistogram[i] * arr[i];
			aoh.add(areaOfHistogram[i]);
		}

		System.out.println("areaOfHistogram = widthOfHistogram[i] * arr[i]-- " + aoh);

		int mah = areaOfHistogram[0];
		for (int i = 1; i < areaOfHistogram.length; i++) {
			if (areaOfHistogram[i] > mah) {
				mah = areaOfHistogram[i];
			}
		}

		System.out.println(" maximum are histogram = maximum element in area " + mah);
	}

}



