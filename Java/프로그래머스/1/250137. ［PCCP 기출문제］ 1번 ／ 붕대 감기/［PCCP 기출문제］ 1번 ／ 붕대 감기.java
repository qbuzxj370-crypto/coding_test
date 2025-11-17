class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int t = 0;
        for(int[] a : attacks) {
            int gap = a[0] - t - 1;
            if (gap > 0) {
                answer += gap * bandage[1];
                answer += (gap / bandage[0]) * bandage[2];
                if (answer > health) answer = health;
            }
            answer -= a[1];
            t = a[0];
            if(answer <= 0) return -1;
        }
        return answer;
    }
}