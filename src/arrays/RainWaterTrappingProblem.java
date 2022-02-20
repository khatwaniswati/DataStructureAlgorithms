package arrays;

public class RainWaterTrappingProblem {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 4, 0, 1, 3, 2 };
		int trappedWaterUnits = trappedWaterUnits(arr);
		System.out.println(trappedWaterUnits);
	}

	private static int trappedWaterUnits(int[] arr) {
		int[] leftMax = new int[arr.length];
		int[] rightMax = new int[arr.length];
		leftMax[0]=arr[0];
		for (int i = 1; i < arr.length; i++) {
			leftMax[i]=Math.max(leftMax[i-1], arr[i]);
		}
		rightMax[arr.length-1]=arr[arr.length-1];
		for (int i = arr.length - 2; i >= 0; i--) {
			rightMax[i]=Math.max(rightMax[i+1], arr[i]);
		}
		int unitsTrapped=0;
		for (int i = 0; i < arr.length; i++) {
			unitsTrapped+= Math.min(leftMax[i], rightMax[i])-arr[i];
		}
		return unitsTrapped;
	}

}
