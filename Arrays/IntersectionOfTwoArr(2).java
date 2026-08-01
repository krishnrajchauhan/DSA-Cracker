import java.util.Arrays;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int i = 0;
        int j = 0;
        int k = 0;

        // Use nums1 to store matches temporarily to save memory
        while (i < n1 && j < n2) {
            if (nums1[i] == nums2[j]) {
                nums1[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = nums1[x];
        }
        return result;
    }
}
