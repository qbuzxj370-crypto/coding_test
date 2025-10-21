class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = total / num - (num % 2 == 0 ? num / 2 - 1 : num / 2);
        for(int i = start; i < start + num; i++) {
            answer[i - start] = i;
        }
        return answer;
    }
}