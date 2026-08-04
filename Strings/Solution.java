class Solution {
    public int lengthOfLastWord(String s) {
       int size = 0;
       int i = s.length() - 1;

       while(i >= 0 && Character.isSpaceChar(s.charAt(i))) {
        i--;
       }

       while(i >= 0 && !Character.isSpaceChar(s.charAt(i))) {
        size++;
        i--;
       }
       return size;
    }
}

// "hello world  "