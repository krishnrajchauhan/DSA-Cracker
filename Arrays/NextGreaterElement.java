class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        
        for(int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            int found = -1;

            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == target) {
                    found = j;
                    break;
                }
            }

            int greaterElement = -1;

            for(int j = found + 1; j < nums2.length; j++) {
                if(nums2[j] > target) {
                    greaterElement = nums2[j];
                    break;
                }
            }
            ans[i] = greaterElement;
        }
        return ans;
    }
}