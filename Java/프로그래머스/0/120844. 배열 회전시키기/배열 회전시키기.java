import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int shift = direction.equals("right") ? -1 : 1;
        
        for(int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[(i + shift + numbers.length/*음수 방지*/) % numbers.length];
        }
        return answer;
    }
}