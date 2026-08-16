// class Solution {
//     public String removeDuplicates(String s) {
//         Stack<Character> stack = new Stack<>();

//         for(int i = 0; i < s.length(); i++) {
//             char current = s.charAt(i);

//             if(!stack.isEmpty() && stack.peek() == current) {
//                 stack.pop();
//             } else {
//                 stack.push(current);
//             }
//         }
//         StringBuilder sb = new StringBuilder();

//         for(char ch : stack) {
//             sb.append(ch);
//         }
//         return sb.toString();
//     }
// }

class Solution {
    public String removeDuplicates(String s) {
       StringBuilder sb = new StringBuilder();

       for(int i = 0; i < s.length(); i++) {
        char current = s.charAt(i);
        int size = sb.length();

        if(size > 0 && sb.charAt(size - 1) == current) {
            sb.deleteCharAt(size - 1);
        } else {
            sb.append(current);
        }
        }
      return sb.toString();
    }
}