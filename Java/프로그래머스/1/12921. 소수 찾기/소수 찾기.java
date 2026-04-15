class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        for(int i = 2; i <= n; i++) {
            cnt = 0;
            if(isPrime(i)) answer++;
        }
        return answer;
    }
    
    private boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}