import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] nums = {a, b, c, d};
        int[] cnt = new int[6];
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums) {
            cnt[n - 1]++;
            if(!list.contains(n)) {
                list.add(n);
            }
        }
        Collections.sort(list);
        int s = list.size();
        switch(s) {
            case 4:
                answer = list.get(0);
                break;
            case 1:
                answer = 1111 * list.get(0);
                break;
            case 2:
                int p = list.get(0), q = list.get(1);
                for(int i = 0; i < cnt.length; i++) {
                    if(cnt[i] == 2) return (p + q) * (q - p);
                    else if(cnt[i] == 1) q = i + 1;
                    else if(cnt[i] == 3) p = i + 1;
                }
                answer = (10 * p + q) * (10 * p + q);
                break;
            case 3:
                answer = 1;
                for(int i = 0; i < cnt.length; i++) {
                    if(cnt[i] == 1) answer *= i + 1;
                }
                break;
        }
        return answer;
    }
}