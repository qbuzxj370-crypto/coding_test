class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1}, dy = {-1, -1, -1, 0, 0, 1, 1, 1};
        int len = board.length;
        
        for(int y = 0; y < board.length; y++) {
            for(int x = 0; x < board.length; x++) {                
                if(board[y][x] == 1) {
                    int nx = 0, ny = 0;
                    
                    for(int i = 0; i < dx.length; i++) {
                        nx = x + dx[i];
                        ny = y + dy[i];
                        
                        if(isValid(nx, ny, len) || board[ny][nx] == 1) continue;
                        
                        board[ny][nx] = 2;
                    }
                }
            }
        }
        
        for(int y = 0; y < board.length; y++) {
            for(int x = 0; x < board.length; x++) {
                if(board[y][x] == 0) answer++;
            }
        }
        
        return answer;
    }
    
    public boolean isValid(int x, int y, int n) {
        return !(0 <= x && x < n && 0 <= y && y < n);
    }
}