class Solution {
    public String convert(String s, int numRows) {
        
        int n = numRows ;
        int i = 1 ;
        int sl = s.length();
        char[] sb = new char[sl+1];
        int k = 0;
        //StringBuilder sb = new StringBuilder();
        if (numRows == 1) return s;
        while( i <= n && i <= sl ) {
            if( i == 1 || i == n ) {
                int idx = i - 1;
                while( idx < sl ) {
                    sb[k++] = s.charAt(idx) ;
                    idx += ( n * 2 ) - 2 ;
                }
            }
            else {
                int idx = i - 1 ;
                while( idx < sl ) {
                    if( idx < sl ) {
                        sb[k++] = s.charAt(idx);
                        idx += ( ( n - i + 1 ) * 2 - 2);
                    }
                    if( idx < sl ) {
                        sb[k++] = s.charAt(idx);
                        idx += ( i * 2 - 2);
                    }
                }
            }
            i++;
        }
        return new String(sb,0,k);
    }
}