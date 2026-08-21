class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res = new StringBuilder();
        for(String word : words) {
            long total = 0;

            for(int i = 0; i < word.length(); i++) {
                total += weights[word.charAt(i) - 'a'];
            }

            int rem = (int) (total % 26);
            char mappedChar = (char) ('z' - rem);
            res.append(mappedChar);
        }
        return res.toString();
    }
}
