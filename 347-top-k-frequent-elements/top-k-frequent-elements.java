class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        List<Integer>[] b = new List[n +1];
        Map<Integer,Integer> m = new HashMap<>();

        for(int i = 0; i < n; i++) 
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);

        for(int key : m.keySet()) {
            int v = m.get(key);
            if(b[v] == null ) b[v] = new ArrayList<>();
            b[v].add(key);
        }
        int[] result = new int[k];
        int c = 0;
        
        for(int i = n; i >= 0 && c < k; i--) {
            if(b[i] != null){
                for(int j : b[i])
                    result[c++] = j;
            }
        }
        return result;
    }
}