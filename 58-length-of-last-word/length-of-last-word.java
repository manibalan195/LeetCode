class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        for(int i = 0; i < s.length()-1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i+1);

            if(!Character.isAlphabetic(first) && Character.isAlphabetic(second))
                count = 0;
            if(Character.isAlphabetic(first))
                count++;
        }
        if(Character.isAlphabetic(s.charAt(s.length()-1)))
                count++;
        return count;

    }
}