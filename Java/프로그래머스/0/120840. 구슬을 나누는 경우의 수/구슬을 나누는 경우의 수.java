class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        
        // nCr = nC(n-r) 성질을 이용해 반복 횟수 최소화
        share = Math.min(share, balls - share);
        
        // 분자를 곱하고 분모를 나누는 과정을 동시에 진행
        for(int i = 0; i < share; i++) {
            answer = answer * (balls - i) / (i + 1);
        }
        
        return (int)answer;
    }
}