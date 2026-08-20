class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int writeAt = 0;

        for(int i = 0; i < n; i++) {
            ans[writeAt++] = nums[nums[i]];
        }
       return ans;
    }
}