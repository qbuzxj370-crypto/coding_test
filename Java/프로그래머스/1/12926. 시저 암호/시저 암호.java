class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                c = (char) ('a' + (c - 'a' + n) % 26);
            } else if (Character.isUpperCase(c)) {
                c = (char) ('A' + (c - 'A' + n) % 26);
            }
            answer += c;
        }
        return answer;
    }
}