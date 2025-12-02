class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        for(int i = 0; i < rank.length; i++) {
            rank[i] = attendance[i] ? rank[i] : 101;
        }
        int answer = min(rank) * 10000 + min(rank) * 100 + min(rank);
        return answer;
    }
    public int min(int[] arr) {
        int minI = 0;
        for(int i = 1; i < arr.length; i++) {
            minI = arr[i] <= arr[minI] ? i : minI;
        }
        int temp = arr[minI];
        arr[minI] = 101;
        return minI;
    }
}