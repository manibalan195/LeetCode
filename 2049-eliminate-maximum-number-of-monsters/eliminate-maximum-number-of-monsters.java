class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;

        int[] time = new int[n];

        for(int i = 0; i < n; i++){
            int t = (dist[i] + speed[i] - 1) / speed[i];
            if(t < n) time[t]++;
        }
        int m = 0;
        int i = 0;
        for(i = 0; i < n; i++){
            m += time[i];
            if(m > i) break;
        }
        return i;

    }
}