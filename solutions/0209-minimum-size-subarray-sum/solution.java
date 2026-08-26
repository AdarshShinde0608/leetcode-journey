class Solution {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
		int result = Integer.MAX_VALUE;
		int low=0, high=0, sum=0;

		while (high < n) {
			sum += nums[high];

			while (sum >= target) {
				int len = high - low +1;
				result = Math.min(len, result);
				sum -= nums[low];
				low++;
			}
			high++;
		}
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}