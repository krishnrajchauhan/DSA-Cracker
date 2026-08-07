import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[] main = s.toCharArray();
        char[] test = t.toCharArray();

        Arrays.sort(main);
        Arrays.sort(test);

        return Arrays.equals(main, test);
       
    }
}