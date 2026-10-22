class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] rem = new int[value];

        for(int i : nums){
            int r = ((i % value) + value) % value;
            rem[r]++;
        }
        int ans = 0;
        while(rem[ans % value] > 0){
            rem[ans % value]--;
            ans++;
        }
        return ans;
    }
}