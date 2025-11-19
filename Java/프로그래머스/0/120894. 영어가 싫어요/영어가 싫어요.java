import java.util.*;

class Solution {
    public long solution(String numbers) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));
        long answer = 0;
        String temp = "";
        for(char c : numbers.toCharArray()) {
            temp += c;
            int idx = list.indexOf(temp);
            if(idx > -1) {
                answer = answer * 10 + idx;
                temp = "";
            }
        }
        return answer;
    }
}