import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        String[] str = s.split("\\},\\{");
        
        Arrays.sort(str, (a, b) -> Integer.compare(a.length(), b.length()));
        int[] answer = new int[str.length];

        for(int i = 0; i < str.length; i++) {
            String[] arr = str[i].split(",");
            
            for(int j = 0; j < arr.length; j++) {
                int n = Integer.parseInt(arr[j]);
                boolean exists = false;
                for (int k = 0; k < i; k++) {
                    if (answer[k] == n) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    answer[i] = n;   
                    break;          
                }
            }
        }
        return answer;
    }
}