class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer = answer * 3 + n % 3; // 뒤집힌 3진법을 반영
            n /= 3;
        }

        return answer;
    }
}