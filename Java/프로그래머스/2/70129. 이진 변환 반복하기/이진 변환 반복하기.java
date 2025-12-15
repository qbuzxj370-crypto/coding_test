class Solution {
    int[] answer = {0, 0};
    public int[] solution(String s) {
        while(!s.equals("1")) {
            int x = s.replace("0", "").length();
            answer[0]++;
            answer[1] += s.length() - x;
            s = Integer.toBinaryString(x);
        }
        return answer;
    }
}