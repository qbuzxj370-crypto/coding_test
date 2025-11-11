class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = 1;
            for(int j = 0; j < score.length; j++) {
                if(score[i][0] + score[i][1] < score[j][0] + score[j][1]) answer[i]++;
            }
        }
        return answer;
    }
}