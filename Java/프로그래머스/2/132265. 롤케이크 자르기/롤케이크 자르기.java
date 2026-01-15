import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> bro = new HashMap<>();
        for (int t : topping) {
            bro.put(t, bro.getOrDefault(t, 0) + 1);
        }
        int broKinds = bro.size();
        
        HashSet<Integer> cher = new HashSet<>();
        int cherKinds = 0;
        
        for (int i = 0; i < topping.length - 1; i++) {
            int t = topping[i];
            
            if(cher.add(t)) cherKinds++;
            
            bro.put(t, bro.get(t) - 1);
            if(bro.get(t) == 0) {
                broKinds--;
            }
            
            if(cherKinds == broKinds) answer++;
        }
        
        return answer;
    }
}