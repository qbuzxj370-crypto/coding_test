class Solution {
    public long solution(int n) {
        long answer = 0;
        long n1 = 0;
        long n2 = 1;
        for(int i = 0; i < n; i++) {
            answer = (n1 + n2) % 1234567;
            n1 = n2;
            n2 = answer;
        }
        return answer;
    }
}