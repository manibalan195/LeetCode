class Solution {

    int fun(int n) {
        int sum = 0;
        while(n > 0) {
            sum += ((n % 10) * (n % 10));
            n /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n ;
        int fast = fun(n);    

        if (n == 1) return true;
        while( slow != fast ) {
            if(fast == 1 || slow == 1)
                return true;
            slow = fun(slow);
            fast = fun(fun(fast));
        }
        return fast == 1;
    }
}