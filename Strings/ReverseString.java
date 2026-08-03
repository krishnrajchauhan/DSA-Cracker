class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        char temp; // Changed to char to match the array type

        while(i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp; 
            
            i++;
            j--;
            // Removed the incorrect if-condition entirely
        }
    }
}
