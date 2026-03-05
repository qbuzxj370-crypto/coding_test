import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == i % 5 + 1) {
                map.put(1, map.get(1) + 1);
            }
            if(answers[i] == b[i % b.length]) {
                map.put(2, map.get(2) + 1);
            }
            if(answers[i] == c[i % c.length]) {
                map.put(3, map.get(3) + 1);
            }
        }
        int maxVal = Collections.max(map.values());
        return map.entrySet().stream()
                .filter(entry -> entry.getValue() == maxVal)
                .mapToInt(Map.Entry::getKey)
                .sorted()
                .toArray();
    }
}