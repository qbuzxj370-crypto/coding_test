class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        for(int i = 1; i < dots.length; i++) {
            double line1 = get_slope(dots[0], dots[i]);
            double line2 = get_slope(dots[i % 3 + 1], dots[(i + 1) % 3 + 1]);
            if(line1 == line2) return 1;
        }
        return answer;
    }
    public double get_slope(int[] dot1, int[] dot2) {
        int dx = dot1[0] - dot2[0];
        int dy = dot1[1] - dot2[1];
        
        return (double)dy/dx;
    }
}