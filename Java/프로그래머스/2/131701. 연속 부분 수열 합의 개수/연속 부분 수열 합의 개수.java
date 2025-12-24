import java.util.*;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        int arrSum = 0;
        for(int e : elements) {
            set.add(e);
        }
        for(int l = 2; l <= elements.length; l++) {
            for(int start = 0; start < elements.length; start++) {
                int sum = 0;
                for(int i = 0; i < l; i++){
                    sum += elements[(i + start) % elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}