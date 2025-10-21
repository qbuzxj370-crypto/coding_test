class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        int[] answer = {0, 0};

        for (String k : keyinput) {
            switch (k) {
                case "left":
                    if (answer[0] - 1 >= -maxX) answer[0]--;
                    break;
                case "right":
                    if (answer[0] + 1 <= maxX) answer[0]++;
                    break;
                case "up":
                    if (answer[1] + 1 <= maxY) answer[1]++;
                    break;
                case "down":
                    if (answer[1] - 1 >= -maxY) answer[1]--;
                    break;
                }
            }
        return answer;
    }
}