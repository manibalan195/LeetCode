class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for(int i=0;i<k;i++)
            sum += cardPoints[i];
        int res = sum;
        int n = cardPoints.length;
        for(int i=0;i<k;i++)
        {
            sum -= cardPoints[k-i-1];
            sum += cardPoints[n-i-1];

            res = Math.max(res,sum);
        }
        return res;
    }
}