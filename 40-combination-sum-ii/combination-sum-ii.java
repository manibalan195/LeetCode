class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        fun(nums,result,new ArrayList<>(),0,target);
        return result;
    }
    public void fun(int[] nums,List<List<Integer>> result,List<Integer> temp,int start,int rem){
        if(rem < 0) return ;
        else if(rem == 0) 
            result.add(new ArrayList<>(temp));
        else {
            for(int i=start; i<nums.length;i++) {
                if(i>start && nums[i] == nums[i-1]) continue;
                temp.add(nums[i]);
                fun(nums,result,temp,i+1,rem-nums[i]);
                temp.remove(temp.size()-1);
            }
        }
    }
}