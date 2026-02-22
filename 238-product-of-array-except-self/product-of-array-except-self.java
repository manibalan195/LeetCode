class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int l = 1;
        int r = 1;

        for(int i = 0; i < n; i++) result[i] = 1;

        for(int i = 0; i < n; i++) {
            result[i] *= l;
            result[n-i-1] *= r;
            
            l *= nums[i];
            r *= nums[n-i-1];
        }
        return result;
    }
}