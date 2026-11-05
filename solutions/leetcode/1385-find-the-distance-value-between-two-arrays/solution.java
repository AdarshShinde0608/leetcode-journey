class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for (int i=0; i<arr1.length; i++) {
            int j=0;
            while (j<arr2.length){
                if (Math.abs(arr1[i]-arr2[j]) <= d) {
                    break;
                }
                j++;
            }
            count++;
        }
        return count;
    }
}