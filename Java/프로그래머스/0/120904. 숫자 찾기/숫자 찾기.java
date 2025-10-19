class Solution {
    public int solution(int num, int k) {
        String n = num + "";
        int answer = n.indexOf(k+"");
        return answer > -1 ? answer + 1 : -1;
    }
}