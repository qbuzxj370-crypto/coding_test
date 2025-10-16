class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        // max - min + 1 <= answer <=, max + min - 1
        answer = min * 2 - 1;
        return answer;
    }
}