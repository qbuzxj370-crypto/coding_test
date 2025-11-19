class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int temp = 0;
        for(char c : my_string.toCharArray()) {
            if('0' <= c && c <= '9') {
                temp = temp * 10 + (c - '0');
            }
            else {
                answer += temp;
                temp = 0;
            }
        }
        char last = my_string.charAt(my_string.length() - 1);
        if('0' <= last && last <= '9') answer += temp;
        return answer;
    }
}