class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        int len = A.length();
        for(int i = 0; i <= len; i++) {
            if(A.equals(B)) break;
            char temp = A.charAt(len - 1);
            A = temp + A.substring(0, len - 1);
            answer = i + 1;
        }
        return answer > len ? -1 : answer;
    }
}