class Solution {
    public int reverse(int x) {

        int n = 0,s = 1;
        if(x < 0){
            s = -1;
            x *= -1;
        }
        while(x>0) {
            if(n > Integer.MAX_VALUE /10) return 0;

            n = (n*10) + (x%10) ;
            System.out.println(n);
            
            x /= 10;
        }
        return n*s;
    }
}