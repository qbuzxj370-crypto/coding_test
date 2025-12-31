import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> speed = new LinkedList<>();
        
        // int[] → LinkedList<Integer> 변환
        for (int p : progresses) list.add(p);
        for (int s : speeds) speed.add(s);

        ArrayList<Integer> answer = new ArrayList<>();
        while(!list.isEmpty()) {
            for(int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) + speed.get(i));
            }
            int cnt = 0;
            while(!list.isEmpty() && list.peek() >= 100) {
                list.poll();
                speed.poll();
                cnt++;
            }
            if(cnt > 0) answer.add(cnt);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}