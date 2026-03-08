class Solution {
    public int rob(int[] nums) {
        int rob21 =  0 , rob22 = 0;
        int n = nums.length;
        int rob11 =  0 , rob12 = 0;
        if(n == 1) return nums[0];
        for (int i = 0; i < n; i++){
            if(i != 0) {
            int t = Math.max(nums[i]+rob11,rob12);
            rob11 = rob12;
            rob12 = t;
            }
            if(i != n-1){
                int t = Math.max(nums[i]+rob21,rob22);
                rob21 = rob22;
                rob22 = t;
            }
        }
        return Math.max(rob12,rob22);
    }
}