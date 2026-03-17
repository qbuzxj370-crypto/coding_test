class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        int knight = 0;
        
        for(int i = 2; i <= number; i++){
            knight = getMeasure(i);
            answer += knight > limit ? power : knight;
        }
        
        return answer;
    }
    public int getMeasure(int num) {
        int cnt = 0;
        int s = (int) Math.floor(Math.sqrt(num));        
        
        for(int i = 1; i <= s; i++) {
            if(num % i == 0) cnt++;
        }
        
        if(s * s == num) cnt = cnt * 2 - 1;
        else cnt *= 2;
        
        return cnt;
    }
}