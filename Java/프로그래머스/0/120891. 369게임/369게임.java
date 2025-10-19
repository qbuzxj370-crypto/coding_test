class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order > 0) {
            int tmp = order % 10;
            if(tmp % 3 == 0 && tmp != 0) {
                answer++;
            }
            order /= 10;
        }
        return answer;
    }
}