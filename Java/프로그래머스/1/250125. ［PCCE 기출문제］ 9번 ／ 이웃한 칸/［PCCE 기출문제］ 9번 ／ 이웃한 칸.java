class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        String color = board[h][w];
        int len = board.length;
        
        int[] dh = {0, 1, -1, 0}, dw = {1, 0, 0, -1};
        
        for(int i = 0; i < dh.length; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            if((0 <= h_check && h_check < len) && (0 <= w_check && w_check < len)) {
                if(board[h_check][w_check].equals(color)) answer++;
            }
        }
        return answer;
    }
}