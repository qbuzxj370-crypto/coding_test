import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // n이 소수라면 바로 반환
        if (prime(n)) return new int[]{n};
        
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0 && prime(i)) {
                list.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        
        // 마지막에 남은 수가 소수라면 추가
        if (n > 1) list.add(n);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
    
    public boolean prime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        int limit = (int)Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}