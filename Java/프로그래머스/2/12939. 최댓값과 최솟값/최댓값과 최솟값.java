import java.util.*;

class Solution {
    public String solution(String s) {
        int[] num = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();;
        int max = num[0];
        int min = num[1];
        for(int n : num) {
            max = n > max ? n : max;
            min = n < min ? n : min;
        }
        String answer = min + " " + max;
        return answer;
    }
}