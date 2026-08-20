class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        HashSet<Integer> set = new HashSet<>();

        for(int friend : friends) {
            set.add(friend);
        }

        int ans[] = new int[friends.length];
        int i = 0;

        for(int person : order) {
            if(set.contains(person)) {
                ans[i++] = person;
            }
        }
        return ans;
        // int ans[] = new int[friends.length];
        // int n = order.length;
        // int write = 0;

        // for(int i = 0; i < n; i++) {
        //     for(int j = 0; j < friends.length; j++) {
        //         if(order[i] == friends[j]) {
        //             ans[write++] = order[i];
        //             break;
        //         }
        //     }
        // }
        // return ans;
    }
}