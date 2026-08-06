class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n]; // Create double-sized array
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];       // Copy to first half
            ans[i + n] = nums[i];   // Copy to second half
        }
        return ans;
    }
}
