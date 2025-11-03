import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        if (arr.length == 0) return stk;
        stk.add(arr[0]);
        for(int i = 0; i < arr.length; i++) {
            int last = stk.size() - 1;
            if(last == -1) {
                stk.add(arr[i]);
                continue;
            }
            if(stk.get(last) >= arr[i]) {
                stk.remove(last);
                i--;
            }
            else {
                stk.add(arr[i]);
            }
        }
        return stk;
    }
}