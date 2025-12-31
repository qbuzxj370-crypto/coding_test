import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int[][] divisors = divisor(yellow);
        int w = 0, h = 0;
        for(int[] pair : divisors) {
            w = pair[0] + 2;
            h = pair[1] + 2;
            if(w * h == brown + yellow) {
                answer[0] = w;
                answer[1] = h;
                break;
            }
        }
        return answer;
    }
    public int[][] divisor(int n) {
        ArrayList<int[]> list = new ArrayList<>();
        for(int i = 1; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0) {
                list.add(new int[]{n/i, i});
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}