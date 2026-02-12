class Solution {
    public int trap(int[] nums) {
        int leftmax = nums[0] , rightmax = nums[nums.length - 1];
        int total = 0,n = nums.length;
        int l = 0, r = n-1;
        
        while(l < r) {
            if(leftmax < rightmax) {
                l++;
                leftmax = Math.max(nums[l],leftmax) ;
                total += leftmax - nums[l];
            }
            else {
                r--;
                rightmax = Math.max(nums[r],rightmax);
                total += rightmax - nums[r];
            }
        }
        return total;
    }
}