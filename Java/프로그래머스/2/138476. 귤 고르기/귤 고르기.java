import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        Arrays.sort(tangerine);
        for(int t : tangerine) {
            if(cnt.keySet().contains(t)) {
                cnt.put(t, cnt.get(t) + 1);
            }
            else {
                cnt.put(t, 1);
            }
        }
        List<Integer> list = new ArrayList<>(cnt.values());
        Collections.sort(list, Collections.reverseOrder());
        int answer = 0;
        for(int i = 0; i < list.size(); i++) {
            k -= list.get(i);
            if(k <= 0) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}