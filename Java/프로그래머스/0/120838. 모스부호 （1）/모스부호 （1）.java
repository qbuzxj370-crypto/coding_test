import java.util.*;
class Solution {
    public String solution(String letter) {
        String[] str = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alp = new String[morse.length];
        for(char c = 'a'; c <= 'z'; c++) {
            alp[c - 'a'] = c + "";
        }
        String answer = "";
        for(String m : str) {
            answer += alp[Arrays.asList(morse).indexOf(m)];
        }
        return answer;
    }
}