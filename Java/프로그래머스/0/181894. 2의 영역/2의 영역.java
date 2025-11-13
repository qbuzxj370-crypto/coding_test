import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int s = list.indexOf(2);
        if(s < 0) return new int[]{-1};
        int e = list.lastIndexOf(2);
        int[] answer = new int[e - s + 1];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr[i + s];
        }
        return answer;
    }
}