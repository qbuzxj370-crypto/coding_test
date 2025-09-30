import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String tmp = "";
        String[] arr = s.split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        for(String str : arr) {
            answer += str;
        }
        return answer;
    }
}