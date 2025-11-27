import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        while(true) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                }
                else if(arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if(Arrays.equals(arr, temp)) break;
            System.arraycopy(arr, 0, temp, 0, arr.length);
            answer++;
        }
        return answer;
    }
}