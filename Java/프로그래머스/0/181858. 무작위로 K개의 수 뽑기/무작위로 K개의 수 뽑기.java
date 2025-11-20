class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for(int i = 0; i < k; i++) answer[i] = -1;
        int j = 0;
        for(int a : arr) {
            if(j == k) break;
            int cnt = 0;
            for(int t = j; t >= 0; t--) {
                if(answer[t] == a) cnt++;
            }
            if(cnt == 0) {
                answer[j++] = a;
            }
        }
        return answer;
    }
}