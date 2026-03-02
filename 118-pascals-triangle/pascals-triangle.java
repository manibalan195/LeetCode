class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++) {
            List<Integer> l = new ArrayList<>();

            long result = 1;
            for(int j = 0; j <= i ; j++ ) {
                l.add((int)result); 
                result = result * (i - j) / (j + 1);
            }

            list.add(l);
        }
        
        return list;
    }
}