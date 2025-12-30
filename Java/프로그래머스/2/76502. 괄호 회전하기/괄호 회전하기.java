import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = con(s);
        StringBuilder sb = new StringBuilder(s);
        for(int x = 1; x < s.length(); x++) {
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
            answer += con(sb.toString());
        }
        return answer;
    }
    public int con(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else{
                if(stack.isEmpty()) return 0;
                char st = stack.pop();
                if ((c == ')' && st != '(') || (c == '}' && st != '{') || (c == ']' && st != '[')) {
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}