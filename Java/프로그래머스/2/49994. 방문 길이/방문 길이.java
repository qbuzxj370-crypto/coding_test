import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0, y = 0;
        HashSet<String> history = new HashSet<>();
        
        for(char c : dirs.toCharArray()) {
            String old = x + ", " + y;
            switch (c) {
                case 'U':
                    if(y >= 5) break;
                    y++;
                    break;
                case 'D':
                    if(y <= -5) break;
                    y--;
                    break;
                case 'R':
                    if(x >= 5) break;
                    x++;
                    break;
                case 'L':
                    if(x <= -5) break;
                    x--;
                    break;
            }
            String current = x + ", " + y;
            if(history.add(old + " -> " + current) && history.add(current + " -> " + old)) answer++;
        }
        return answer;
    }
}