import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int f = 0, l = 0;
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                f = 0;
                l = query[i];
            }
            else {
                f = query[i];
                l = arr.length - 1;
            }
            arr = Arrays.copyOfRange(arr, f, l + 1);
        }
        return arr;
    }
}