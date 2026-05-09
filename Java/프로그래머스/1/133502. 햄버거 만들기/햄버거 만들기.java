import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> stack = new ArrayList<>();
        
        for(int i : ingredient) {
            stack.add(i);
            
            if(stack.size() >= 4) {
                int size = stack.size();
                
                if(stack.get(size - 1) == 1 &&
                   stack.get(size - 2) == 3 &&
                   stack.get(size - 3) == 2 &&
                   stack.get(size - 4) == 1) {
                    answer++;
                    
                    for (int j = 0; j < 4; j++) {
                        stack.remove(stack.size() - 1);
                    }
                }
            }
        }
        
        return answer;
    }
}