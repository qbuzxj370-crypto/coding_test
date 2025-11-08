class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(char c : my_string.toCharArray()) {
            answer[c - 'A' - (Character.isLowerCase(c) ? 6 : 0)]++;
        }
        return answer;
    }
}