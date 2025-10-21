class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[len];
        for(int i = 0; i < len; i++) {
            answer[i] = "";
            for(int j = 0; j < n; j++) {
                try {
                    answer[i] += my_str.charAt(i * n + j);
                }
                catch(Exception e) {
                    break;
                }
            }
        }
        return answer;
    }
}