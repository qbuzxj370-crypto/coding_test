import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int num : scoville) {
            pq.offer(num);
        }
        
        while(pq.peek() < K) {
            answer++;
            pq.offer(pq.poll() + pq.poll() * 2);
            if(pq.size() == 1 && pq.peek() < K) {
                return -1;
            }
        }
        
        return answer;
    }
}