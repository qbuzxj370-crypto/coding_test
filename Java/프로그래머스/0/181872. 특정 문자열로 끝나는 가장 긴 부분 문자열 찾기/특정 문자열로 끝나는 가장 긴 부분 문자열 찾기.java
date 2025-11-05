class Solution {
    public String solution(String myString, String pat) {
        int idx = myString.lastIndexOf(pat);
        String answer = myString.substring(0, idx + pat.length());
        return answer;
    }
}