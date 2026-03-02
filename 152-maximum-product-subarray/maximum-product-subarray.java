class Solution {
    public int maxProduct(int[] nums) {
        int lp = 1 , rp = 1 , n = nums.length ;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n ; i++) {
            
            if(lp == 0) lp = 1;  
            if(rp == 0) rp = 1;

            lp *= nums[i];
            rp *= nums[n-i-1];

            max = Math.max(max,Math.max(lp,rp));
        }
        return max;
    }
}