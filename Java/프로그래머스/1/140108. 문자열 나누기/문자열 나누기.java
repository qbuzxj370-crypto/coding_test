class Solution {
    public int solution(String s) {
        int answer = 0;
        int cnt1 = 0, cnt2 = 0, idx = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(idx)) cnt1++;
            else cnt2++;
            if(cnt1 == cnt2) {
                cnt1 = 0;
                cnt2 = 0;
                answer++;
                idx = i + 1;
            }
        }
        if(cnt1 != 0 || cnt2 != 0) {
            answer++;
        }
        return answer;
    }
}