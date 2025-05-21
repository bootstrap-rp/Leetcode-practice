class Solution {
	public static int sumOddLengthSubarrays(int[] arr) {

		int ans = 0;

		for (int i = 0; i < arr.length; i++) {

			int temp = 0;

			for (int j = i; j < arr.length; j++) {
				temp +=arr[j];

				if((j-i+1) % 2 == 1) {
					ans += temp;
				}
			}
		}
		return ans;
	}
}