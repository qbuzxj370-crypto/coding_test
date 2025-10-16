class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int big = sides[0] > sides[1] ? sides[0] : sides[1];
        int small = sides[0] < sides[1] ? sides[0] : sides[1];
        answer = small; // 가장 긴 변이 big인 경우
        int i = big + small - 1;
        while(i > big) {
            answer++;
            i--;
        }
        
        return answer;
    }
}