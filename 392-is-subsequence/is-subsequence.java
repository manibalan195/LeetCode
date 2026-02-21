class Solution {
    public boolean isSubsequence(String s, String t) {
        int l = 0 ;
        for(int i = 0; i < t.length(); i++) {
            if(l >= s.length()) return true;
            if(s.charAt(l) == t.charAt(i)) l++;
        }
        if(l >= s.length()) return true;

        return false;
    }
}