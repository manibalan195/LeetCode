class Solution {
    public boolean isTrionic(int[] nums) {
        int p = -1, q = -1;
        int i=1, n = nums.length;
        while(i < n  && nums[i-1] < nums[i] ) {
            p = i++;
        }
        while(i < n && nums[i-1] > nums[i]) {
            q = i++;
        }
        while(i < n && nums[i-1] < nums[i]) {
            i++;
        }

        if( p!=-1 && q != -1 && i == n && q != i-1) return true;
        return false;
    }
}