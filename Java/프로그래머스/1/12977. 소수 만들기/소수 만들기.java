class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            int sum = 0;
            for(int j = i+1; j < nums.length - 1; j++) {
                sum = nums[i] + nums[j];
                for(int k = j+1; k < nums.length; k++) {
                    if(isPrime(sum + nums[k])) answer++;
                }
            }
        }
        return answer;
    }
    public boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= n / i; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }  
}