class Solution {
    public static int max(int a, int b) {
        if (a>b) {
            return a;
        }
        return b;
    }
    
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = k - 1;
        int sum = 0, result = sum;
        
        for (int i = low; i <= high; i++) {
            sum += arr[i];
        }
        
        result = sum;
        low++; high++;
        
        while (high<n) {
            sum -= arr[low - 1];
            sum += arr[high];
            result = max(sum, result);
            
            low++; high++;
        }
        
        return result;
    }
}
