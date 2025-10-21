import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        Arrays.sort(dots, (a, b) -> Integer.compare(a[0], b[0]));
        int h = Math.abs(dots[0][1] - dots[1][1]);
        int w = Math.abs(dots[0][0] - dots[2][0]);
        return w * h;
    }
}