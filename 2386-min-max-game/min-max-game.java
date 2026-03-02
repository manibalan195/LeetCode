class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        boolean flag = true;

        while(n > 1) {
            int j = 0;
            for (int i = 0; i < n - 1 ; i+=2) {
                if(flag)
                    nums[j++] = Math.min(nums[i],nums[i+1]);
                else
                    nums[j++] = Math.max(nums[i],nums[i+1]);
                flag = !flag;
            }
            n /= 2;
        }
        return nums[0];
    }
}