class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zerocnt = 0;
        int numcnt = 0;
        for(int l : lottos) {
            if(l == 0) {
                zerocnt++;
                continue;
            }
            for(int w : win_nums) {
                if(l == w) {
                    numcnt++;
                    break;
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = 6 - (zerocnt + numcnt >= 2 ? zerocnt + numcnt - 1 : 0);
        answer[1] = 6 - (numcnt >= 2 ? numcnt - 1 : 0);
        return answer;
    }
}