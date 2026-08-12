class Solution {
    static int idx = 0;
    public int[][] solution(int n) {
        int[][] answer = new int [(1 << n) - 1][2];
        move(n, 1, 2, 3, answer);
        return answer;
    }
    
    public void move(int n, int from, int via, int to, int[][] answer) {
        if(n == 1) answer[idx++] = new int[]{from, to};
        else {
            move(n - 1, from, to, via, answer);
            answer[idx++] = new int[]{from, to};
            move(n - 1, via, from, to, answer);
        }
    }
}