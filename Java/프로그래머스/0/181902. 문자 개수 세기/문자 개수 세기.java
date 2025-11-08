class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int idx = 0;
        for(char c : my_string.toCharArray()) {
            idx = c - 65;
            if(c > 90) {
                idx -= 6;
            }
            answer[idx]++;
        }
        return answer;
    }
}