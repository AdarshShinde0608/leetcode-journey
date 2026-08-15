class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        for(int i=0; i<nums.size(); i++){
            nums[i] *= nums[i];
        }

        for(int j=nums.size()-1; j>0; j--){
            for(int i=0; i<j; i++){
                if(nums[i]>nums[i+1]){
                    swap(nums[i], nums[i+1]);
                }
            }
        }
        return nums;
    }
};