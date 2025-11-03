import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();        
        for(int i =0; i < arr.length; i++) {
            for(int n : delete_list) {
                if(arr[i] == n) {
                    arr[i] = 0;
                }
            }
            list.add(arr[i]);
        }
        int[] answer = list.stream().filter(i -> i > 0).mapToInt(i -> i).toArray();
        return answer;
    }
}