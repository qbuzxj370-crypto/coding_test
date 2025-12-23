import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> used = new HashSet<>();
        int idx = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() == 1 || (i > 0 && word.charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1))) {
                idx = i + 1;
                break;
            }
            if (used.contains(word)) {
                idx = i + 1;
                break;
            }
            used.add(word);
        }

        if(idx > 0) {
            answer[0] = (idx % n == 0) ? n : idx % n;   // 사람 번호
            answer[1] = (idx % n == 0) ? idx / n : idx / n + 1; // 턴 번호

        }
        return answer;
    }
}