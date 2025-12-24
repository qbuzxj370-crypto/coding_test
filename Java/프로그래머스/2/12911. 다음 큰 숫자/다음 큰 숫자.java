class Solution {
    public int solution(int n) {
        int answer = n + 1;
        int cntOne = Integer.toBinaryString(n).replace("0", "").length();
        while(true) {
            int one = Integer.toBinaryString(answer).replace("0", "").length();
            if(one == cntOne) break;
            answer++;
        }
        return answer;
    }
}