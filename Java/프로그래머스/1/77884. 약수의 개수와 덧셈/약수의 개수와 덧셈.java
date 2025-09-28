class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;
        for(int num = left; num <= right; num++) {
            cnt = 0;
            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    cnt++;
                }
            }
            answer += cnt % 2 == 0 ? num : -num;
        }
        return answer;
    }
}