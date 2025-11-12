import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> cnt = new HashMap<>();
        
        for(String s : strArr) {
            int len = s.length();
            cnt.put(len, cnt.getOrDefault(len, 0) + 1);
        }
        int answer = 0;
        for(int c : cnt.values()) answer = c > answer ? c : answer;
        return answer;
    }
}