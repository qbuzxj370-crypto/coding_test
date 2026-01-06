class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] dx = {1, 0, -1, 0}; // 오른쪽, 아래, 왼쪽, 위
        int[] dy = {0, 1, 0, -1};
        int direction = 0; // 방향(변경 값의 인덱스 번호)
        int x = 0, y = 0;

        for(int i = 1; i <= n * n; i++) {
            answer[y][x] = i;
            x += dx[direction];
            y += dy[direction];
            if(x >= n || x < 0 || y >= n || y < 0 || answer[y][x] != 0) {
                x -= dx[direction];
                y -= dy[direction];
                direction = (direction + 1) % 4;
                x += dx[direction];
                y += dy[direction];
            }
            
        }
        return answer;
    }
}