class Solution {
    public int solution(int[][] signals) {
        int answer = -1;
        int[] lights = new int[signals.length];
        
        for(int i = 0; i < lights.length; i++) {
            lights[i] = signals[i][0] + signals[i][1] + signals[i][2];
        }
        
        for(int t = 1; t <= 2000000; t++) {
            int cnt = 0;
            for(int i = 0; i < lights.length; i++) {
                int temp = (t - 1) % lights[i];
                if(temp >= signals[i][0] && temp < signals[i][0] + signals[i][1]) cnt++;
                else {
                    cnt = 0;
                    break;
                }
            }
            if(cnt == signals.length) return t;
        }
        
        return answer;
    }
}