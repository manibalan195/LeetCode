class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);

        for(int i=0;i<sc.length && i<tc.length ;i++) {
            if(sc[i] != tc[i]) return false;
        }
        if(sc.length != tc.length) return false;
        return true;
    }
}