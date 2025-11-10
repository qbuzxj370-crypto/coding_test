import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] str = my_string.toLowerCase().split("");
        Arrays.sort(str);
        String answer = "";
        for(String s : str) {
            answer += s;
        }
        return answer;
    }
}