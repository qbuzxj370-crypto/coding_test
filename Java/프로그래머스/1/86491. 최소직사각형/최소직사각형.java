class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0, height = 0;
        for(int[] s : sizes) {
            int x = Math.max(s[0], s[1]);
            int y = Math.min(s[0], s[1]);
            width = Math.max(width, x);
            height = Math.max(height, y);
        }
        
        return width * height;
    }
}