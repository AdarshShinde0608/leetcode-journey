import java.util.*;

class Solution {
    public int gcd(int a, int b) {
    return (b == 0) ? a : gcd(b, a % b);
    }

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int n = nums.length;

        res = gcd(nums[0], nums[n-1]);

        return res;
    }
}