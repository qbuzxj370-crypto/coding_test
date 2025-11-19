class Solution {
    public int solution(int n) {
        int fact = 1;
        int answer = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
            if(fact >= n) {
                answer = fact == n ? i : --i;
                break;
            }
        }
        return answer;
    }
}