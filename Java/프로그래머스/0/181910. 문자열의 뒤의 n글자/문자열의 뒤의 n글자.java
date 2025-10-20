class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int start = my_string.length() - n;
        for(int i = start; i < my_string.length(); i++) {
            answer += my_string.charAt(i);
        }
        // return my_string.substring(start);
        return answer;
    }
}