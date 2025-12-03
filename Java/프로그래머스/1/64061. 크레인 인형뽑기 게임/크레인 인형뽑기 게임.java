import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int i = 0, temp = 0;
        for(int m : moves) {
            for(int j = 0; j < board.length; j++) {
                if (board[j][m - 1] != 0) {
                int doll = board[j][m - 1];
                board[j][m - 1] = 0;

                if (!stack.isEmpty() && stack.peek() == doll) {
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(doll);
                }
                    break;
                }
            }
        }
        return answer;
    }
}