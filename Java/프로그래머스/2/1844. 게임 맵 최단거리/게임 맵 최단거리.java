import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        int[][] distance = new int[n][m];
        distance[0][0] = 1;
        
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int y = cur[0];
            int x = cur[1];
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                boolean inRange = 0 <= ny && ny < n && 0 <= nx && nx < m;
                if (!inRange) continue;
                
                boolean canVisit = maps[ny][nx] == 1 && distance[ny][nx] == 0;
                if (!canVisit) continue;
                
                distance[ny][nx] = distance[y][x] + 1;
                queue.offer(new int[]{ny, nx});
            }
        }
        
        return distance[n-1][m-1] > 0 ? distance[n-1][m-1] : -1;
    }
}