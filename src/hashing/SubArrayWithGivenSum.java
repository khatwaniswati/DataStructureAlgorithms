package hashing;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int arr[] = {10,15,-5,15,-10,5};
		int sum=5;
		subArraySum(arr,sum);
	}

	private static void subArraySum(int[] arr, int sum) {
		int start=0,end=-1;
		int curSum=0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			curSum+=arr[i];
			if(curSum==sum) {
				start=0;
				end=i;
				break;
			}
			if(map.containsKey(curSum-sum)) {
				start=map.get(curSum-sum)+1;
				end=i;
				break;
			}
			map.put(curSum, i);
		}
		if(end==-1)
			System.out.println("Sum not Found");
		else
			System.out.println("start:"+start+" end:"+end);
	}

}
