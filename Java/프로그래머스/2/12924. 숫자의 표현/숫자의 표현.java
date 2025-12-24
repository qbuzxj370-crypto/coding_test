class Solution {
    public int solution(int n) {
        int answer = 0;
        // 연속된 자연수의 합으로 표현하는 경우의 수는 n의 홀수 약수의 개수와 동일
        // 연속된 k개의 수의 합은 (a + (a+1) + ... + (a+k-1)) = k*a + k*(k-1)/2.
        for (int i = 1; i <= n; i += 2) { // 홀수 약수만 확인
            if (n % i == 0) answer++;
        }
        return answer;
    }
}