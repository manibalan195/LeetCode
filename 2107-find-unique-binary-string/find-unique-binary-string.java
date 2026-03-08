class Solution {
    public String findDifferentBinaryString(String[] nums) {
        
        String s = "";
        for (int i = 0; i < nums.length; i++) {
            Character curr = nums[i].charAt(i);
            s += curr == '0' ? '1' : '0';
        }
        return s;
    }
}