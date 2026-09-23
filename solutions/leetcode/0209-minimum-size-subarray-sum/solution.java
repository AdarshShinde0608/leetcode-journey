class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum=0, result=Integer.MAX_VALUE;
        int low=0, high=0;

        while (high<n) {
            sum += nums[high];

            while (sum >= target) {
                int len = high-low+1;
                result = Math.min(len, result);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        if (result==Integer.MAX_VALUE) return 0;
        return result;
    }
}