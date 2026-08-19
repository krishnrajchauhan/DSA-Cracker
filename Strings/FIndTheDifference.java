class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];

        if(s.length() == 0 && t.length() == 0) {
            return "";
        }
        else if(s.length() == 0 && t.length() != 0) {
            return t;
        }
        else if(s.length() != 0 && t.length() == 0) {
            return s;
        }
        else {
            for(char c : s.toCharAyyay()) {
                count[c - 'a']++;
            }

            for(char c : t.toCharArray()) {
                count[c - 'a']++;
            }

            for(int i = 0; i < count.length; i++) {
                if(count[i] == 1) {
                    return count[i];
                }
            }
        return -1;
        }

    }
}