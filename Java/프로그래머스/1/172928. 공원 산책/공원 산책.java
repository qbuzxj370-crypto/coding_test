class Solution {
    public int[] solution(String[] park, String[] routes) {
        int height = park.length;
        int width = park[0].length();
        
        char[][] grid = new char[height][width];
        int y = 0, x = 0;
        
        for (int i = 0; i < height; i++) {
            grid[i] = park[i].toCharArray();
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == 'S') {
                    y = i;
                    x = j;
                }
            }
        }
        
        for(String r : routes) {
            String[] parts = r.split(" ");
            String op = parts[0];
            int n = Integer.parseInt(parts[1]);
            
            int nextY = y;
            int nextX = x;
            boolean canMove = true;
            
            // 3. n칸만큼 한 칸씩 이동해보며 검사
            for (int i = 0; i < n; i++) {
                if (op.equals("E")) nextX++;
                else if (op.equals("W")) nextX--;
                else if (op.equals("S")) nextY++;
                else if (op.equals("N")) nextY--;
                
                // 범위 초과하거나 장애물 만나면 이동 불가 판정 후 break
                if (nextY < 0 || nextY >= height || nextX < 0 || nextX >= width || grid[nextY][nextX] == 'X') {
                    canMove = false;
                    break;
                }
            }
            
            // 4. 이동 시 문제가 없으면 위치 갱신
            if (canMove) {
                y = nextY;
                x = nextX;
            }
        }
        return new int[]{y, x};
    }
}