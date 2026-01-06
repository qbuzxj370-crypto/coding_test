import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] hof = new int[k];
        int min = 2001;
        Arrays.fill(hof, -1);
        for(int i = 0; i < score.length; i++) {
            if(i < k) {
                hof[0] = score[i];
                Arrays.sort(hof);
                if(min > score[i]) min = score[i];
                answer[i] = min;
                continue;
            }
            if(score[i] > hof[0]) {
                hof[0] = score[i];                
            }
            Arrays.sort(hof);
            answer[i] = hof[0];
        }
        return answer;
    }
}