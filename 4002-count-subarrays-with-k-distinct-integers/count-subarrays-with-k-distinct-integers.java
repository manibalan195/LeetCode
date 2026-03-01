class Solution {
    public long countSubarrays(int[] nums, int k, int m) {

        int n = nums.length;
        Map<Integer, Integer> frequency = new HashMap<>();

        int start = 0;
        int distinct = 0;
        int atLeastM = 0;

        long total = 0;
        int stretch = 0;

        for (int end = 0; end < n; end++) {

            int current = nums[end];
            int oldFreq = frequency.getOrDefault(current, 0);

            if (oldFreq == 0) distinct++;

            frequency.put(current, oldFreq + 1);

            if (oldFreq + 1 == m) atLeastM++;

            while (distinct > k) {

                int remove = nums[start];
                int f = frequency.get(remove);

                if (f == m) atLeastM--;
                if (f > m) stretch--;

                frequency.put(remove, f - 1);

                if (f - 1 == 0) distinct--;

                start++;
                stretch = 0;
            }

            if (distinct == k && atLeastM == k) {

                while (frequency.get(nums[start]) > m) {
                    frequency.put(nums[start], frequency.get(nums[start]) - 1);
                    start++;
                    stretch++;
                }

                total += stretch + 1;
            }
        }

        return total;
    }
}