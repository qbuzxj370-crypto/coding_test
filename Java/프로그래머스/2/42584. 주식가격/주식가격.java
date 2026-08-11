import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int p = stack.pop();
                answer[p] = i - p;
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()) {
            int p = stack.peek();
            answer[stack.pop()] = prices.length - p - 1;
        }
        return answer;
    }
}