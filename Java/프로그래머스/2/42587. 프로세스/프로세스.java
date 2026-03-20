import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
        }
        
        while(!queue.isEmpty()) {
            int max = getMax(queue);
            int[] current = queue.poll();
            
            if(max == current[1]) {
                answer++;
                if(current[0] == location) break;
            } else {
                queue.add(current);                
            }
        }
        
        return answer;
    }
    
    public int getMax(Queue<int[]> queue) {
        int len = queue.size();
        int max = -1;
        
        for(int i = 0; i < queue.size(); i++) {
            int[] current = queue.poll();
            
            if(max < current[1]) {
                max = current[1];
            }
            
            queue.add(current);
        }
        
        return max;
    }
}