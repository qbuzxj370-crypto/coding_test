import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int stage : stages) {
            map.put(stage, map.getOrDefault(stage, 0) + 1);
        }
        
        double[][] fail = new double[N][2];
        int n = stages.length; // 현재 스테이지에 남아있는 사람
        for(int i = 1; i <= N; i++) {
            int count = map.getOrDefault(i, 0);
            
            fail[i - 1][0] = i;
            fail[i - 1][1] = (n == 0) ? 0 : (double)count / n;
            
            n -= count;
        }
        
        Arrays.sort(fail, (a, b) -> {
            int cmp = Double.compare(b[1], a[1]); // 실패율 내림차순
            if (cmp == 0) {
                return Double.compare(a[0], b[0]); // 스테이지 오름차순
            }
            return cmp;
        });
        
        for(int i = 0; i < N; i++) {
            answer[i] = (int)fail[i][0];
        }
        
        return answer;
    }
}