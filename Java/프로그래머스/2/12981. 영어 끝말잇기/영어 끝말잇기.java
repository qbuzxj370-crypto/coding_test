import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        Set<String> used = new HashSet<>();
        int idx = 0;
        for (int j = 0; j < words.length; j++) {
            String word = words[j];
            if (word.length() == 1 || (j > 0 && word.charAt(0) != words[j - 1].charAt(words[j - 1].length() - 1))) {
                idx = j + 1;
                break;
            }
            if (used.contains(word)) {
                idx = j + 1;
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