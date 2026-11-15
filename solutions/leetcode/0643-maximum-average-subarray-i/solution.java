class Solution {
    public static int max(int a, int b) {
		if (a>b) {
			return a;
		}
		return b;
	}

    public double findMaxAverage(int[] nums, int k) {
		int n = nums.length;
		int low = 0, high = k - 1;
		int sum = 0, result = sum;
		
		for (int i = low; i <= high; i++) {
			sum += nums[i];
		}
		
		result = sum;
		low++; high++;
		while (high<n) {
			sum -= nums[low - 1];
			sum += nums[high];
			result = max(sum, result);
			
			low++; high++;
		}
		return result/k;
    }
}